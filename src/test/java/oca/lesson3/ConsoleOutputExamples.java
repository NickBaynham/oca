package oca.lesson3;

import org.junit.Test;

import java.io.Console;

public class ConsoleOutputExamples {

    @Test
    public void test() {
        Console console = System.console();
        if (console != null) {
            console.writer().printf("Hello");
            console.writer().println("Hello");
            console.printf("Hello");
            console.flush();
        }
    }

    @Test
    public void test2() {
        System.out.println("Hello");
    }

    @Test
    public void test3() {
        int x = 42;
        System.out.printf("The count is %d \n", x);
        System.out.printf("A new line will be output. %n");
    }

    @Test
    public void test4() {
        double pi = 3.14159;
        System.out.printf("The value of PI is %f\n", pi);
    }
}
