package testExamples;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;



public class Matching {






/*
        Examples

        1. deductibles lookup problem

        Filter the table to matching rows. Two Coverage Amounts are available: 0, 10000
        If your coverage amount is less than 10,000 you get the lower value of 1.21
        If your coverage is equal or greater than 10,000 you get the higher value of 1.14
        We want to find the value in the table that is the largest value that is not greater than

        Test Cases:
        Id          Coverage    Factor
        1           0           1.21
        2           9999        1.21
        3           10000       1.14
        4           10001       1.14
        5           20000       1.14

 */




    @Test
    public void test_case_1() {
        String result = getFilterOutput(coverageLimits, testCases.get(0));
        assertEquals(result, "0");
    }

    @Test
    public void test_case_2() {
        String result = getFilterOutput(coverageLimits, testCases.get(1));
        assertEquals(result, "0");
    }

    @Test
    public void test_case_3() {
        String result = getFilterOutput(coverageLimits, testCases.get(2));
        assertEquals(result, "10000");
    }

    @Test
    public void test_case_4() {
        String result = getFilterOutput(coverageLimits, testCases.get(3));
        assertEquals(result, "10000");
    }

    @Test
    public void test_case_5() {
        String result = getFilterOutput(coverageLimits, testCases.get(4));
        assertEquals(result, "10000");
    }

    private static String getFilterOutput(List<String> lines, String filter) {
        Collections.reverse(lines);
        for (String line : lines) {
            if (Double.parseDouble(line) <= Double.parseDouble(filter)) {
                return line;   // Exact match should be added
            }
        }
        Collections.reverse(lines);
        return lines.get(0);
    }

    private List<String> coverageLimits = Arrays.asList("0", "10000");
    private List<String> testCases = Arrays.asList("0", "9999", "10000", "10001", "20000");
}