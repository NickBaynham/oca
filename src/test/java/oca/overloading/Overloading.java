package oca.overloading;

import org.junit.Test;

public class Overloading {
    private void doStuff() {
        System.out.println("No Arguments");
    }

    private void doStuff(int number) {
        System.out.println("An int argument: " + number);
    }

    private int doStuff(int... numbers) {
        return numbers[0];
    }

    private String doStuff(String number, int... numbers) {
        int first = doStuff(numbers);
        System.out.println(first);
        return number;
    }

    @Test
    public void test() {
        Overloading over = new Overloading();
        over.doStuff();
        int number = (int) (Math.random() * 10);
        over.doStuff(number);
        System.out.println("I've got: " + doStuff(number, 1));
        System.out.println("Do Stuff: " + doStuff(number + "", 1, 2, 3, 4));
    }
}
