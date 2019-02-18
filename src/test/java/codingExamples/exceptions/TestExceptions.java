package codingExamples.exceptions;

import org.junit.Test;

public class TestExceptions {
    @Test
    public void test() {
        try {
            System.out.println("Hello, world!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds.");
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception occurred.");
        } catch (Error e) {
            System.out.println("Error occurred.");
        } catch (Exception e) {
            System.out.println("Exception occurred.");
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            System.out.println("Done.");
        }
    }

    @Test
    public void testThrow() {

        try {
            throw new Exception("Sorry, everything went wrong.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new Error("An error occurred also.");
        } catch (Error er) {
            System.out.println(er.getMessage());
        }
    }

    @Test
    public void custom() {
        MyAwesomeException exception = new MyAwesomeException("Just what do you think you're doing Dave?");

        try {
            throw exception;
        } catch (MyAwesomeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyAwesomeException extends Exception {
    MyAwesomeException(String message) {
        super(message);
    }
}
