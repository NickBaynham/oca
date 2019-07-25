package com.github.nickbaynham.examples;

public class FunnyIdea {
    private static final FunnyIdea funnyIdea = new FunnyIdea();
    private FunnyIdea(){};    // Only code within the class can initialize an instance

    public void doSomethingFunny() {
        System.out.println("doing something funny");
    }

    public static FunnyIdea getFunnyIdea() {
        return funnyIdea;
    }

    public static void main(String[] args) {
        FunnyIdea funny = FunnyIdea.getFunnyIdea();
        funny.doSomethingFunny();
    }
}
