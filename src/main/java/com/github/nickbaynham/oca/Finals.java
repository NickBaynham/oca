package com.github.nickbaynham.oca;

public class Finals {
    private transient final String name;
    private volatile int id;                // thread related modifier to reconcile private copy

    Finals() {
        name = "Robin";
    }

    String getName() {
        return name;
    }

    public static void main(String[] args) {
        final int x;
        x = 100;        // once assigned a value, it can't be changed

        final String s;
        s = "Hello";

        final String[] t = s.split("l");        // final reference must always refer to the same object

        t[0] = s.toLowerCase();     // you can change the object that the final reference is pointing to
        System.out.println(t[0]);
    }
}
