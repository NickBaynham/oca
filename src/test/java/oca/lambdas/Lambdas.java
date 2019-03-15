package oca.lambdas;

import org.junit.Test;

import java.util.function.Predicate;

public class Lambdas {
    @Test
    public void test() {
        Lambdas lambdas = new Lambdas();
        // lambdas.go(() -> add(5, 1) < 7);
        lambdas.go(x -> add(6, 2) < 9);
        // lambdas.go(x, y -> add(3, 2) < 4);
    }

    void go(Predicate<Lambdas> e) {
        Lambdas lambda = new Lambdas();
        if (e.test(lambda)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    static int add(int x, int y) {
        return x + y;
    }
}
