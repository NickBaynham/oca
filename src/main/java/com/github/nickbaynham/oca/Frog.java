package com.github.nickbaynham.oca;

public class Frog {
    private static int counter;

    Frog() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        Frog frog1 = new Frog();
        Frog frog2 = new Frog();
        Frog frog3 = new Frog();
        System.out.println("We have " + Frog.getCounter() + " Frogs.");
    }
}
