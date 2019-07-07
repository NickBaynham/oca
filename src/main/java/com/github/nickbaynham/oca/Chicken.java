package com.github.nickbaynham.oca;

public class Chicken {
    private int numEggs = 0;
    private String name;

    public Chicken() {
        name = "Duke";
    }

    public String getName() {
        return name;
    }

    public void addAnEgg() {
        numEggs++;
    }

    public int getNumEggs() {
        return numEggs;
    }
}
