package com.github.nickbaynham.oca;

public class StartingPoint extends Pointer{
    private int x, y;
    private static final int X, Y;

    // a static init block

    static {
        X = 14;
        Y = 22;
    }
    // an instance init block
    {
        x = 7;
        y = 9;
        setPoints(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        StartingPoint point = new StartingPoint();
        System.out.println(point.getX());
        System.out.println(point.getY());
    }
}

class Pointer {
    private int x, y;
    protected void setPoints(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
