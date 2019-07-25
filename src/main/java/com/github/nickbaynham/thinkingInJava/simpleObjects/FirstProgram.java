package com.github.nickbaynham.thinkingInJava.simpleObjects;

import java.util.Date;

/**
 * The First Thinking In Java Program (with JavaDoc added)
 * Displays today's date followed by some system parameters
 * @uthor Nick Baynham
 * @version 0.01
 *
 */
public class FirstProgram {
    /**
     * Enry Point  point to class and application
     *
     * @param args array of String arguments
     */
    public static void main(String[] args) {
        System.out.println(new Date());
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
    }
}
