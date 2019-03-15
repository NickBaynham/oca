package oca;

import org.junit.Test;

public class Strings {
    @Test
    public void test() {
        String a = "abc";
        String b = a;
        a += "d";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);

        StringBuilder ab = new StringBuilder("abc");
        StringBuilder bb = ab;
        ab.append("d");
        System.out.println(ab);
        System.out.println(bb);
        System.out.println(ab == bb);

    }
}
