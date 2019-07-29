package com.github.nickbaynham.oca.arrays;

import java.util.Arrays;

public class UsingArrays {

    public static void main(String[] args) {
        String[] mammals = {
                "monkey",
                "chimp",
                "donkey"
        };

        System.out.println("We have " + mammals.length + " mammals available.");
        System.out.println("You selected the " + mammals[0]);
        System.out.println("You also selected the " + mammals[mammals.length - 1]);
        Arrays.sort(mammals);
        System.out.println(Arrays.toString(mammals));
    }
}
