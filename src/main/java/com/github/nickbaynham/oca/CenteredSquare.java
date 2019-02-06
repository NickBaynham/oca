package com.github.nickbaynham.oca;

public class CenteredSquare extends Rectangle implements Centered {
    private double cx, cy;

    public CenteredSquare(double cx, double cy, double w) {
        super(w, w);
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
