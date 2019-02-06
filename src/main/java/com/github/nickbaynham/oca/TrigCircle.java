package com.github.nickbaynham.oca;

public class TrigCircle {
    private static final int NUMPTS = 500;
    private static double sines[] = new double[NUMPTS];
    private static double cosines[] = new double[NUMPTS];
    private int meaningOfLife;

    static {
        double x = 0.0;
        double delta_x = (Circle.PI()/2)/(NUMPTS - 1);
        for (int i = 0; i < NUMPTS; i++, x += delta_x) {
            sines[i] = Math.sin(x);
            cosines[i] = Math.cos(x);
        }
    }

    static {
        // another static initializer
    }

    {
        // instance initializer is also possible, but rare
        meaningOfLife = 42;
    }

    public int getMeaningOfLife() {
        return meaningOfLife;
    }

    public static double[] getSines() {
        return sines;
    }

    public static double[] getCosines() {
        return cosines;
    }
}
