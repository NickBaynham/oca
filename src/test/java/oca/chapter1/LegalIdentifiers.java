package oca.chapter1;

import org.junit.Test;

public class LegalIdentifiers {
    @Test
    public void test() {
        int _a;
        _a = 42;
        System.out.println(_a);
    }

    @Test
    public void test_2() {
        int $a = 47;
        System.out.println($a);
    }
}
