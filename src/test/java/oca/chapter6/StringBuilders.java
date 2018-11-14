package oca.chapter6;

import org.junit.Assert;
import org.junit.Test;

public class StringBuilders {

    @Test
    public void test() {
        StringBuilder stringBuilder = new StringBuilder("Scott");
        stringBuilder.append(" Steele");
        System.out.println(stringBuilder);
    }

    @Test
    public void methods() {
        StringBuilder scott = new StringBuilder("Scott");
        scott.append(" Steele")
                .replace(0, 5, "Spock")
                .reverse()
                .delete(5, 6)
                .delete(10, 11)
                .delete(6, 7)
                .replace(2, 4,"i")
                .replace(3, 4, "te");
        System.out.println(scott);
    }

    @Test
    public void sb() {
        boolean[] expected = {true, true, false, true};
        boolean[] actual = {false, false, false, false};
        String java1 = "Java";
        String java2 = "Java";
        StringBuilder java3 = new StringBuilder();
        java3.append("Ja").append("va");
        actual[0] = java1 == java2;
        actual[1] = java1.equals(java2);
        actual[2] = java3.toString() == java1;
        actual[3] = java3.toString().equals(java1);
        Assert.assertArrayEquals(expected, actual);
    }
}
