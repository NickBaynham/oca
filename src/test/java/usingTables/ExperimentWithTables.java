package usingTables;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static org.junit.Assert.*;
import static usingTables.TableUtils.*;

public class ExperimentWithTables {

    @Test
    public void exactMatch() {

        // Define the Mock Lookup Table

        TestData testData = new TestData();
        RateTable table = testData.get();
        Map<String,String> matchers = new HashMap<>();
        matchers.put("Policy Type", "HO3");
        matchers.put("Medical Coverage", "1000k");
        matchers.put("Policy Amount", "160000");
        List<Map<String, String>> resultSet = Table.filter(table.getAttributeRows(), row -> Table.multiMatch(row, matchers));
        if (resultSet.size() == 1) System.out.println(resultSet.get(0).get("Factor"));
        assertEquals(resultSet.size(), 1);
        assertEquals(resultSet.get(0).get("Factor"), "532");
    }

    @Test
    public void interpolatedMatch() {

        // Define the Mock Lookup Table

        TestData testData = new TestData();
        RateTable table = testData.get();
        Map<String,String> matchers = new HashMap<>();
        matchers.put("Policy Type", "HO3");
        matchers.put("Medical Coverage", "1000k");
        List<Map<String, String>> resultSet = Table.filter(table.getAttributeRows(), row -> Table.multiMatch(row, matchers));
        assertEquals(resultSet.size(), 102);

        // At this point we have filtered the table by matching, next we can perform interpolation to find the matching factor
        double result = interpolateResultSet(resultSet, "Policy Amount", "164000");
        assertEquals(result, 544.0, 0.1);
    }

    @Test
    public void interpolationTesting() {

        // Define the Mock Lookup Table

        TestData testData = new TestData();
        RateTable table = testData.get();


        // A lookup on Policy Type = HO3 should return 102 rows

        {
            Map<String,String> matchers = new HashMap<>();
            matchers.put("Policy Type", "HO3");

            List<Map<String, String>> resultSet = Table.filter(table.getAttributeRows(), row -> Table.multiMatch(row, matchers));
            if (resultSet.size() == 1) System.out.println(resultSet.get(0).get("factor"));
            assertEquals(resultSet.size(), 102);
        }

        // A Lookup on Policy Type = HO4; Medical Coverage = 2000k should result in two rows found

        {
            Map<String,String> matchers = new HashMap<>();
            matchers.put("Policy Type", "HO4");
            matchers.put("Medical Coverage", "2000k");
            List<Map<String, String>> resultSet = Table.filter(table.getAttributeRows(), row -> Table.multiMatch(row, matchers));
            if (resultSet.size() == 1) System.out.println(resultSet.get(0).get("Factor"));
            assertEquals(resultSet.size(), 2);
        }

        // Generally, we will be able to find a unique exact match in a table

        {
            Map<String,String> matchers = new HashMap<>();
            matchers.put("Policy Type", "HO3");
            matchers.put("Medical Coverage", "1000k");
            matchers.put("Policy Amount", "160000");
            List<Map<String, String>> resultSet = Table.filter(table.getAttributeRows(), row -> Table.multiMatch(row, matchers));
            if (isUnique(resultSet)) System.out.println(resultSet.get(0).get("Factor"));
            assertTrue(isUnique(resultSet));
            assertEquals(resultSet.get(0).get("Factor"), "532");
        }
    }

    @Test
    public void interpolation() {
        double premium = interpolate(164_000.00, 160_000.00, 170_000.00, 532.00, 561.00);
        assertEquals(premium, 544.0, 0.1);
    }

    @Test
    public void test() {

        Table table = new Table();
        List<Map<String,String>> result = table.filter(table.asList(), row -> table.matchEqual(row, "code", "0002"));
        if (result.size() == 1) System.out.println(result.get(0).get("factor"));
    }

    @Test
    public void multiMatch() {

        // Set up the Matchers
        Map<String,String> matchers = new HashMap<>();
        matchers.put("code", "0002");
        matchers.put("id", "2");

        // Look up Factor using matchers
        Table table = new Table();
        List<Map<String,String>> resultSet = table.filter(table.asList(), row -> table.multiMatch(row, matchers));
        if (resultSet.size() == 1) System.out.println(resultSet.get(0).get("factor"));
    }
}

class Table {
    private static List<Map<String,String>> table;
    static {
        table = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Map<String, String> row = new HashMap<>();
            row.put("id", i + "");
            row.put("code", "000" + i);
            row.put("factor", "" + (i + 66));
            table.add(row);
        }
    }

    public String toString() {
        return table.toString();
    }

    List<Map<String, String>> asList() {
        return new ArrayList<>(table);
    }

    String getDefaultValue(String key) {
        return table.get(0).get(key);
    }

    static List<Map<String,String>> filter(List<Map<String,String>> table, Predicate<Map<String,String>> filter) {
        List<Map<String,String>> result = new ArrayList<>();
        for (Map<String,String> row : table) {
            if (filter.test(row)) {
                result.add(row);
            }
        }
        return result;
    }

    boolean matchEqual(Map<String, String> row, String attribute, String value) {
        return row.get(attribute).equalsIgnoreCase(value);
    }

    static boolean multiMatch(Map<String, String> row, Map<String, String> matcher) {
        for (String key : matcher.keySet()) {
            if (! row.get(key).equalsIgnoreCase(matcher.get(key))) return false;
        }
        return true;
    }
}


class Field {
    private String attribute;
    private String value;
    private boolean isNumeric;

    Field(String attribute, String value, boolean isNumeric) {
        this.attribute = attribute;
        this.value = value;
        this.isNumeric = isNumeric;
    }

    String getAttribute() {
        return attribute;
    }

    String getValue() {
        return value;
    }

    public boolean isNumeric() {
        return isNumeric;
    }
}

class Row {
    private List<Field> fields;
    private Map<String,String> attributes;

    Row(List<Field> fields, Map<String,String> attributes) {
        this.attributes = attributes;
        this.fields = fields;
    }

    public String get(String attribute) throws NotFoundException {
        for (Field field : fields) {
            if (field.getAttribute().equals(attribute)) return field.getValue();
        }
        throw new NotFoundException("Field does not exist in row.");
    }

    Map<String,String> getAttributes() {
        return new HashMap<String,String>(attributes);
    }
}

class NotFoundException extends Exception {
    NotFoundException(String msg) {
        super(msg);
    }
}

class TableUtils {

    static double interpolateResultSet(List<Map<String,String>> resultSet, String lookupField, String lookupValue) {
        // 1: Using numeric comparison, find the row index of the lower row (the value is higher but less than the next row)
        int index = getInterpolationIndex(resultSet, lookupField, lookupValue);
        // 2: Using the index, extract the lower and higher lookup values, and the lower and higher factors
        String lowerLookup = resultSet.get(index).get(lookupField);
        String higherLookup = resultSet.get(index + 1).get(lookupField);
        String lowerFactor = resultSet.get(index).get("Factor");
        String higherFactor = resultSet.get(index + 1).get("Factor");
        // 3: Perform the interpolation
        return interpolate(asNumeric(lookupValue), asNumeric(lowerLookup), asNumeric(higherLookup), asNumeric(lowerFactor), asNumeric(higherFactor));
    }

    private static int getInterpolationIndex(List<Map<String,String>> resultSet, String lookupField, String lookupValue) {
        for (Map<String,String> row : resultSet) {
            if (asNumeric(row.get(lookupField)) > asNumeric(lookupValue)) {
                return resultSet.indexOf(row) - 1;
            }
        }
        return 0;
    }

    private static double asNumeric(String value) {
        return Double.parseDouble(value);
    }

    static double interpolate(double value, double lowerLookup, double higherLookup, double lowerFactor, double higherFactor) {
        double additionalAmount = value - lowerLookup;
        double differenceAmount = higherLookup - lowerLookup;
        double differenceFactor = higherFactor - lowerFactor;
        double additionalPremium = (additionalAmount / differenceAmount) * differenceFactor;
        return round(lowerFactor + additionalPremium);
    }

    private static double round(double value) {
        return Math.round(value);
    }

    static boolean isUnique(List<Map<String,String>> rows) {
        return rows.size() == 1;
    }
}

// for a Table you may have a text filter match and an optional numeric or interpolation match
// you would first reduce the rows by all applying all the text filters
// For numeric, you would use the look up value to find the highest field value, and return the row by numerical comparison (which must be identified beforehand)
// Another possibility is interpolation between two values in the table using the lookup value


class RateTable {
    private List<Row> rows = new ArrayList<>();
    private List<Map<String,String>> attributeRows = new ArrayList<>();

    void add(Row row) {
        rows.add(row);
        attributeRows.add(row.getAttributes());
    }

    List<Row> getRows() {
        return new ArrayList<>(rows);
    }

    List<Map<String, String>> getAttributeRows() {
        List<Map<String,String>> result = new ArrayList<>();
        for (Map<String,String> row : attributeRows) {
            result.add(new HashMap<String,String>(row));
        }
        return result;
    }
}

class TestData {
    RateTable get() {
        RateTable table = new RateTable();
        for (int i = 0; i < 100; i++) {
            List<Field> fields = new ArrayList<>();
            fields.add(new Field("Policy Type","HO3",false));
            fields.add(new Field("Medical Coverage", "1000k", false));
            fields.add(new Field("Policy Amount", i + "000", true));
            fields.add(new Field("Factor", (i + 400) + "", false));

            Map<String,String> attributes = new HashMap<>();
            attributes.put("Policy Type", "HO3");
            attributes.put("Medical Coverage", "1000k");
            attributes.put("Policy Amount", i + "000");
            attributes.put("Factor", (i + 400) + "");
            Row row = new Row(fields, attributes);
            table.add(row);
        }
        {
            List<Field> fields = new ArrayList<>();
            fields.add(new Field("Policy Type", "HO3", false));
            fields.add(new Field("Medical Coverage", "1000k", false));
            fields.add(new Field("Policy Amount", "160000", true));
            fields.add(new Field("Factor", "532", false));

            Map<String,String> attributes = new HashMap<>();
            attributes.put("Policy Type", "HO3");
            attributes.put("Medical Coverage", "1000k");
            attributes.put("Policy Amount", "160000");
            attributes.put("Factor", "532");
            Row row = new Row(fields, attributes);
            table.add(row);
        }
        {
            List<Field> fields = new ArrayList<>();
            fields.add(new Field("Policy Type", "HO3", false));
            fields.add(new Field("Medical Coverage", "1000k", false));
            fields.add(new Field("Policy Amount", "170000", true));
            fields.add(new Field("Factor", "561", false));

            Map<String,String> attributes = new HashMap<>();
            attributes.put("Policy Type", "HO3");
            attributes.put("Medical Coverage", "1000k");
            attributes.put("Policy Amount", "170000");
            attributes.put("Factor", "561");
            Row row = new Row(fields, attributes);
            table.add(row);
        }
        {
            List<Field> fields = new ArrayList<>();
            fields.add(new Field("Policy Type", "HO4", false));
            fields.add(new Field("Medical Coverage", "1000k", false));
            fields.add(new Field("Policy Amount", "160000", true));
            fields.add(new Field("Factor", "532", false));

            Map<String,String> attributes = new HashMap<>();
            attributes.put("Policy Type", "HO4");
            attributes.put("Medical Coverage", "1000k");
            attributes.put("Policy Amount", "160000");
            attributes.put("Factor", "532");
            Row row = new Row(fields, attributes);
            table.add(row);
        }
        {
            List<Field> fields = new ArrayList<>();
            fields.add(new Field("Policy Type", "HO4", false));
            fields.add(new Field("Medical Coverage", "1000k", false));
            fields.add(new Field("Policy Amount", "170000", true));
            fields.add(new Field("Factor", "561", false));

            Map<String,String> attributes = new HashMap<>();
            attributes.put("Policy Type", "HO4");
            attributes.put("Medical Coverage", "1000k");
            attributes.put("Policy Amount", "170000");
            attributes.put("Factor", "561");
            Row row = new Row(fields, attributes);
            table.add(row);
        }
        {
            List<Field> fields = new ArrayList<>();
            fields.add(new Field("Policy Type", "HO4", false));
            fields.add(new Field("Medical Coverage", "2000k", false));
            fields.add(new Field("Policy Amount", "170000", true));
            fields.add(new Field("Factor", "561", false));

            Map<String,String> attributes = new HashMap<>();
            attributes.put("Policy Type", "HO4");
            attributes.put("Medical Coverage", "2000k");
            attributes.put("Policy Amount", "170000");
            attributes.put("Factor", "561");
            Row row = new Row(fields, attributes);
            table.add(row);
        }
        {
            List<Field> fields = new ArrayList<>();
            fields.add(new Field("Policy Type", "HO4", false));
            fields.add(new Field("Medical Coverage", "2000k", false));
            fields.add(new Field("Policy Amount", "170000", true));
            fields.add(new Field("Factor", "561", false));

            Map<String,String> attributes = new HashMap<>();
            attributes.put("Policy Type", "HO4");
            attributes.put("Medical Coverage", "2000k");
            attributes.put("Policy Amount", "170000");
            attributes.put("Factor", "561");
            Row row = new Row(fields, attributes);
            table.add(row);
        }
        return table;
    }
}