package com.github.nickbaynham.thinkingInJava.simpleObjects;

public class Light {
    private int state;

    public void on() {
        state = 10;    // turn full on
    }

    public void off() {
        state = 0;    // turn full off
    }

    public void brighten() {
        if (state <= 7) {
            state += 3;
        } else {
            state = 10;
        }
    }

    public void dim() {
        if (state >= 3)
            state -= 3;
        else
            state = 0;
    }

    public int getLightState() {
        return state;
    }

    public static void main(String[] args) {
        Light light = new Light();
        System.out.println(light.getLightState());
        light.on();
        light.brighten();
        light.dim();
        light.dim();
        System.out.println(light.getLightState());
        light.off();
        System.out.println(light.getLightState());
    }
}
