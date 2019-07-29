package com.github.nickbaynham.oca.arrays;

import java.util.*;

public class SortAndSearch {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(10);
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.binarySearch(numbers, i));
        }
    }
}
