package com.github.nickbaynham.oca;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return height * width;
    }

    public double circumference() {
        return 2 * (width + height);
    }
}
