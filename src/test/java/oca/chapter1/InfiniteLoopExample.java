package oca.chapter1;

import org.junit.Test;

public class InfiniteLoopExample {

    // Basic Example

    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }
    }

    // Weird Assignment with compiler warning: i++ is never used

    @Test
    public void Assignment() {
        int i = 0;
        i = i++;
        System.out.println("i: " + i);

        int j = 0;
        j = ++j;
        System.out.println("j: " + j);
    }

    // Proper use of post increment

    @Test
    public void postIncrement() {
        int i = 0;
        i++;
        System.out.println("i: " + i);
    }
}
