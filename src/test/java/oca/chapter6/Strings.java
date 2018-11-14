package oca.chapter6;

import org.junit.Test;

public class Strings {
    @Test
    public void test() {
        String string = "";
        string = "Hello, World!";
        System.out.println(string);
    }

    @Test
    public void test2() {
        String s = "Hello, World!";
        String s2 = s;
        s2 = s.concat(" but wait, there's more!!!");
        System.out.println(s2);
        System.out.println(s);
    }

    @Test
    public void stringFunctions() {
        String java = "Java";
        System.out.println(java);
        System.out.println(java.toUpperCase());
                    String oracle = java.replace('a','x');
        System.out.println(oracle);
    }

    @Test
    public void stringQuestion() {
        String s1 = "spring ";
        String s2 = s1 + "summer ";
        s1.concat("fall ");
        s2.concat(s1);
        s1 += "winter ";
        System.out.println(s1 + " " + s2);
    }

    @Test
    public void char_at() {
        String example = "Hello Spock Steele!";
        char first = example.charAt(6);
        System.out.println(example);
        System.out.println(first);
        System.out.println(example.charAt(12));
    }

    @Test
    public void concat_example() {
        String firstName = "Scott";
        String lastName = "Steele";
        String fullName = firstName.concat(lastName);
        System.out.println(fullName);
    }

    @Test
    public void equals_ignore_case() {
        String perpetrator = "Scott Steele";
        String input = "scott steele";
        if (perpetrator.equalsIgnoreCase(input)) {
            System.out.println("We've found our man.");
        } else {
            System.out.println("No idea who did this.");
        }

        assert(perpetrator.equalsIgnoreCase(input));
    }

    @Test
    public void length_example() {
        String villain = "Spock Steele";
        System.out.println("The Villain's name is " + villain.length() + " characters long.");
    }

    @Test
    public void replace_example() {
        String culprit = "Scott A Steele";
        String compressed = culprit.replace(' ', '%');
        System.out.println(compressed);
    }

    @Test
    public void substring_example() {
        String name = "Scott Steele";
        String first = name.substring(0, 5);
        String last = name.substring(6);  // when one arg is given, it's the remainder of the string starting with Index
        System.out.println("Name: " + name + " First: " + first + " Last: " + last);
    }

    @Test
    public void lower_upper() {
        String name = "Scott Steele";
        System.out.println("Lower case: " + name.toLowerCase());
        System.out.println("Upper case: " + name.toUpperCase());
    }

    @Test
    public void trim_examples() {
        String example1 = "     Scott Steele            ";
        System.out.println(">" + example1.trim() + "<");
    }
}
