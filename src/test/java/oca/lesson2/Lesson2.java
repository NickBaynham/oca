// package "family name" must be first statement, but is optional
package oca.lesson2;  // where the class belongs

// zero or more import statements
import java.util.Date;

/***
 * One or more classes per file
 */
public class Lesson2 {
    public Lesson2() {
        Lesson2Second second = new Lesson2Second();  // we can refer to a class in the same package by its short name
        oca.chapter2.Enums enums;  // we must refer to a class in a different package by its long name
        Date date;                                        // imported classes from a different package can also be refered to by the short name
    }

    public static void main(String[] args) {
        System.out.println("Lesson 2");
    }
}

// we can have more than one class or interface
// not a usual thing to do
// must not be public

// class Another {}

interface MyInterface {}

// Two classes in the same package can refer to each other by their "short" name
