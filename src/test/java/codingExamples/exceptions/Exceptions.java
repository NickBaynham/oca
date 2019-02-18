package codingExamples.exceptions;

import org.junit.Test;

import java.io.*;

public class Exceptions {
    @Test
    public void test() throws FileNotFoundException {
        int result = doTheThing();
        System.out.println(result);
    }

    private int doTheThing() {
        int i = 0;
        int j = 0;
        try {
            int k = i / j;
            new BufferedReader(new FileReader("marco.txt"));
            return -1;
        } catch (IOException io) {
            return -1;
        } catch (ArithmeticException r) {
            return 0;
        } finally {
            System.out.println("Done");
        }
    }
}