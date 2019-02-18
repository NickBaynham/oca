package oca.autoboxing;

import org.junit.Test;

import java.util.Random;

public class TestInteger {
    @Test
    public void test() {
        Random random = new Random();
        Integer i = 42;
        System.out.println(i * 2);
        Integer j = random.nextInt(50);
        if (i.equals(j)) System.out.println("Equal");
        System.out.println(j);
    }

    @Test
    public void test2() {
        Integer i1 = 1000;
        Integer i2 = 2000;
        if (i1 != i2) System.out.println("different objects!");
        if (i1.equals(i2)) System.out.println("meaningfully equal");

        Integer i3 = 10;
        Integer i4 = 10;
        if (i3 == i4) System.out.println("same objects");
        if (i3.equals(i4)) System.out.println("meaningfully equal");
    }
}
