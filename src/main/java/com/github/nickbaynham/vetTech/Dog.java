package com.github.nickbaynham.vetTech;

public class Dog {
    private String name;
    private int weight;
    private int age;

    public Dog(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + ", " + weight + "lbs, " + age + " years old.";
    }
}
