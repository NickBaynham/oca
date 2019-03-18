package oca.argumentLists;

import org.junit.Test;

public class ArgumentLists {
    static void example (int... numbers) {
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }

    @Test
    public void test() {
        example(1,2,3,4,5,6);
        example(0,1,2,3,4,5,6,7,8);
    }
}
