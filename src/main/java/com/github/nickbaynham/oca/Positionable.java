package com.github.nickbaynham.oca;

public interface Positionable extends Centered {
    void setUpperRightCorner(double x, double y);

    double getUpperRightX();
    double getUpperRightY();
}
