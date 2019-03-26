package oca.exceptions;

import org.junit.Test;

public class MoreExceptions {

    @Test
    public void test() throws Throwable {
        Throwable t = new Throwable("I'm a throwable!");
        Exception e = new Exception("I'm an exception.");
        RuntimeException r = new RuntimeException("I'm a run time exception");
        Error er = new Error("I'm an Error.");
        int headsOrTails = (int) (Math.random() * 10);
        System.out.println(headsOrTails);
        if (headsOrTails == 1 || headsOrTails == 0) throw er;
        if (headsOrTails > 6) throw r;
        if (headsOrTails > 3) throw t;
        else throw e;
    }

    @Test
    public void testRuntimeException() throws RuntimeException {
        String[] zero = new String[0];
        try {
            System.out.println(zero[0]);
        } catch (RuntimeException r) {
            System.out.println("Nope.");
        } catch (Error er) {
            System.out.println("It's an error.");
        } catch (Throwable e) {
            System.out.println("Sorry, there's no elements in this array.");
        }
    }
}


