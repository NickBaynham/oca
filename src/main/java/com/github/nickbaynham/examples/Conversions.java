package com.github.nickbaynham.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Conversions {
    public static void main(String[] args) {
        List<Map<String,String>> myTestCases = new ArrayList<>();
        Map<String,String> case1 = new HashMap<>();
        Map<String, String> case2 = new HashMap<>();
        Map<String, String> case3 = new HashMap<>();

        case1.put("ID", "1");
        case1.put("Line", "HO3");
        case1.put("State", "FL");

        case2.put("ID", "1");
        case2.put("Line", "HO3");
        case2.put("State", "FL");

        case3.put("ID", "1");
        case3.put("Line", "HO3");
        case3.put("State", "FL");

        myTestCases.add(case1);
        myTestCases.add(case2);
        myTestCases.add(case3);

        // Convert to Object[][]

        Object[][] result = new Object[myTestCases.size()][];
        for (int i = 0; i < myTestCases.size(); i++) {
            // System.out.println(myTestCases.get(i));
            Object[] myCase = new Object[myTestCases.get(i).size()];
            for (int j = 0; j < myTestCases.get(i).size(); j++) {
                // System.out.println(myTestCases.get(i).get(myTestCases.get(i).keySet().toArray()[j]));
                myCase[j] = myTestCases.get(i).get(myTestCases.get(i).keySet().toArray()[j]);
            }
            result[i] = myCase;
        }

        for (Object[] next : result) {
            for (Object item : next) {
                System.out.println(item);
            }
        }

    }
}
