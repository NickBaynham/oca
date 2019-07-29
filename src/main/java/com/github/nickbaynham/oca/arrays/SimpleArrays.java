package com.github.nickbaynham.oca.arrays;

import java.util.Arrays;
import java.util.Random;

public class SimpleArrays {
    private String[] names;                     // defaults to null, since Array is an object
    private String[] books = new String[2];     // An array with each element as null as default

    public static void main(String[] args) {
        int[]numbers = new int[100];      // spaces are optional in the declaration!

        // loading the array with random numbers

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(10);
        }

        // Display the contents of an Array

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = new int[] {42, 55, 99};
        System.out.println(Arrays.toString(numbers2));

        int[] numbers3 = {506, 201, 33, 88};

        System.out.println(Arrays.toString(numbers3));

        int type1[], type2;

        String[] bugs = {"cricket", "beetle", "ladybug"};
        System.out.println(bugs[1]);
    }
}
