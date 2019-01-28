package oca.primitiveDataTypes;

import org.junit.Test;

public class Conversions {

    @Test
    public void test() {
        int i = (int) 13L;
        byte b = (byte) i;
        System.out.println(b);

        // you can convert to integer using a cast
        int pi = (int) 3.14159;
        int piRounded = (int) Math.round(3.14159);
        System.out.println(pi);
        System.out.println(piRounded);

        int piFloor = (int) Math.floor(Math.PI);
        int piCeil = (int) Math.ceil(Math.PI);

        System.out.println(piFloor);
        System.out.println(piCeil);
    }

    @Test
    public void associativity() {
        int b = 42;
        int c = -3;
        int d = 10;

        int a = b += c = -~d;
        System.out.println(a);
    }

    @Test
    public void test2() {
        int a = 2;
        int v = ++a + ++a * ++a;
        int w = a++ + a++ * a++;
        System.out.println(v);
        System.out.println(w);
    }

    @Test
    public void instanceOfTest() {
        System.out.println("" instanceof String);
        System.out.println(new Long(100L) instanceof Long);
        System.out.println(new Boolean(true) instanceof Boolean);
    }
}
