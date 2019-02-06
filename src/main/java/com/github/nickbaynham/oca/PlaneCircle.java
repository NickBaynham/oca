package com.github.nickbaynham.oca;

public class PlaneCircle extends Circle {
    private final double cx, cy;
    private double distanceOrigin;

    public PlaneCircle() {
        super();
        cx = cy = 1.0;
    }

    public PlaneCircle(double radius, double x, double y) {
        super(radius);
        this.cx = x;
        this.cy = y;
    }

    public double getCenterX() {
        return cx;
    }

    public double getCenterY() {
        return cy;
    }

    public boolean isInside(double x, double y) {
        double dx = x - cx, dy = y = cy;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return (distance < getRadius());
    }

    public void setDistanceOrigin() {
        distanceOrigin = Math.sqrt(cx *cx + cy * cy);  // Pythagorean Theorem
    }
}
