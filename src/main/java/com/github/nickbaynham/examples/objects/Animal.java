package com.github.nickbaynham.examples.objects;

// most simple example of a class

import java.util.*;
import java.lang.*;         // redundant
import java.lang.System;    // redundant
import com.github.nickbaynham.examples.LinkedStack;     // redundant because it's the same package

public class Animal {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int random(int range) {
        Random random = new Random();
        return random.nextInt(range);
    }
}

// you can have more than one class per file but only one can be public and must have the same name

class PreviousAnimal {
    String name = "Bob";
    public static void main(String[] args) {
        System.out.println("Hello, World!");        // class doesn't have to be public for main to work
    }
}
