package codingExamples;

import org.junit.Test;

public class Exceptions2 {
    @Test
    public void test() {
        System.out.println(doIt());
    }

    private int doIt() {
        int i = 0; int j = 0;

        try {
            int k = i / j;
        } catch (ArithmeticException e) {
            return -1;
        } catch (RuntimeException r) {
            return 0;
        } finally {
            System.out.println("Done.");
        }
        return 1;
    }
}
