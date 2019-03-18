package oca.exceptions;

import org.junit.Test;

public class Exceptions {


    private void withException() throws Exception {
        throw new Exception("withExceptions throws an exception");
    }

    @Test
    public void test() {
        try {
            Exceptions e = new Exceptions();
            e.withException();
        } catch (Exception e) {
            System.out.println("An Exception was caught.");
        } finally {
            System.out.println("finished.");
        }
    }
}
