package com.github.nickbaynham.oca;

public class CenteredCircle extends Circle implements Centered {
    private double cx, cy;

    public CenteredCircle(double cx, double cy, double w) {
        super(w);
        this.cx = cx;
        this.cy = cy;
    }

    @Override
    public void setCenter(double x, double y) {
        cx = x;
        cy = y;
    }

    @Override
    public double getCenterX() {
        return cx;
    }

    @Override
    public double getCenterY() {
        return cy;
    }
}
