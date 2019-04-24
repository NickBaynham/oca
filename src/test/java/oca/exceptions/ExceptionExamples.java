package oca.exceptions;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExamples {

    // Checked Exceptions = Environment, attempt recovery
    // Runtime Exceptions = Shouldn't happen, can't recover (Unchecked)
    // Errors = External to the program, not required to attempt recovery (unrecoverable, like memory full)

    @Test
    public void test() throws Exception {
        throw new Exception("I'm an Exception to the rule!");
    }

    @Test
    public void test2() throws Throwable {
        try {
            int i = 100 / 0;
        } finally {
            throw new Throwable("Im' throwable.");
        }
    }

    @Test
    public void test3() {
        try {
            throw new ArithmeticException("Math Problem");
        } catch (ArithmeticException e) {
            throw new Throwable("Throw me");
        } finally {
            throw new RuntimeException("run time.");
        }
    }

    @Test
    public void stacked() throws Throwable {
        try {
            throw new IOException();
        } catch (IOException e) {
            throw new FileNotFoundException("");
        } catch (Error e) {
            throw new FileNotFoundException();
        }
    }
}
