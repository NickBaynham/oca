package testExamples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matching2 {

    @Test
    public void test() {

        Double[] coverages = {0.0, 10_000.0, 50_000.0, 100_000.0, 200_000.0};
        double expected = 90_000; // 2

        int match = -1;
        for (int i = 0; i < coverages.length; i++) {
            System.out.println("Index: " + i + " Coverage: " + coverages[i]);

            // If we find an exact match, obviously this is the one to use

            if (expected == coverages[i]) {
                System.out.println("We found an exact match: " + coverages[i]);
                match = i; // the index of correct coverage
                break;
            }

            // If we find a coverage that is larger, we should use that if it is the first one to be larger

            if (expected < coverages[i]) {
                System.out.println("Coverage: " + coverages[i] + " is larger than: " + expected);
                break;
            }

            if (expected > coverages[i]) {
                System.out.println("Coverage: " + coverages[i] + " is smaller than: " + expected);
            }

            match = i;

        }
        if (match > -1)
            System.out.println("The correct coverage to use is: " + coverages[match] + ", which means we need to use the factor from row: " + match);
        else System.out.println("Sorry, you will have to use the default!");
    }

    @Test
    public void stream() {
        List<String> coverageLimits = Arrays.asList("0", "10000", "50000", "100000", "200000");
        List<String> testData = Arrays.asList("0", "100000", "90000", "300999");

        for (String lookup : testData) {
            List<String> result = getFilterOutput(coverageLimits, lookup);
            for (String temp : result) {
                System.out.println(temp);
            }
        }
    }
    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (Double.parseDouble(line) == Double.parseDouble(filter)) {
                result.add(line);   // Exact match should be added
            }
        }
        return result;
    }
}
