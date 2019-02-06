package com.github.nickbaynham.oca;

public class Circle extends Shape {

    private static final double PI = Math.PI;
    private double radius = 1.0;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        checkRadius(radius);
        this.radius = radius;
    }

    public static double radiansToDegrees(double radians) {
        return radians * 180 / PI;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double circumference() {
        return 2 * PI * radius;
    }

    static double PI() {
        return PI;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        checkRadius(radius);
        this.radius = radius;
    }

    private void checkRadius(double radius) {
        if (radius < 0.0)
            throw new IllegalArgumentException("radius may not be negative.");
    }
}
