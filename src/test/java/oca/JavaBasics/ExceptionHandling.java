package oca.JavaBasics;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@SuppressWarnings("ALL")
public class ExceptionHandling {

    @Test
    public void test() {
        try {
            System.out.println("Try Something!");
        } finally {
            System.out.println("Finally...");
        }
    }

    @Test
    public void test2() {
        try {
            System.out.println("Force an exception...");
            int i = 1 / 0;
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }

    @Test
    public void test3() {
        try {
            System.out.println("Force Exception!");
            int i = 1 / 0;
        } catch (Exception e) {
            ;
        } finally {
            System.out.println("Finally...");
        }
    }

    //   All new code that deals with resources should be written in the TWR style

    @Test
    public void tryWithResources() {
        try (InputStream is = new FileInputStream("details.txt")) {
            System.out.println("Trying to process the file...");
        } catch (FileNotFoundException e) {
            System.out.println("The file only exists in your head?");
        } catch (IOException e) {
            System.out.println("I'm having trouble working with the file.");
        } finally {
            System.out.println("That's all folks!");
        }
    }
}
