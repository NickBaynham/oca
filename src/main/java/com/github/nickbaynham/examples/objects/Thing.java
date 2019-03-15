package com.github.nickbaynham.examples.objects;

import java.util.Date;

// Declaring variables

public class Thing {
    private int count;
    protected Date today;
    int x, y, z;
    int[] a, b, c;
    int d = 3, e = 4;

    int meaningOfLife = 42;

    double randomNumber = Math.random() * 1000;
    private int f = 95;
    public int celsius = calculateCelsius();

    private int calculateCelsius() {
        return 5 * (f - 32) / 9;
    }

    public void setF(int f) {
        this.f = f;
        this.celsius = calculateCelsius();
    }
}
