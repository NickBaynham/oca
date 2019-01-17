package oca.lesson2.structure;

public class Structure {
    public float getTemperatgure() {
        return temperature;
    }

    public static int getgABigNumberf() {
        return A_BIG_NUMBER;
    }

    private static int A_BIG_NUMBER = 123456;
    private float temperature;

    public Structure() {
        temperature = 98.4F;
    }

    public void makeOne() {
        AConcept ac = new AConcept();
    }

    class InnerClass {}
}

class AConcept {}
