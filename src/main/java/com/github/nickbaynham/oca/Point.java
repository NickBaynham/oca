package com.github.nickbaynham.oca;

/**
 * Represents a Cartesian (x,y) point
 */
public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x*x + y * y);
    }
}
