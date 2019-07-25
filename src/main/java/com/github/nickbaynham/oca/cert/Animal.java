package com.github.nickbaynham.oca.cert;

public class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        this(getRandomName());
    }

    public String getName() {
        return name;
    }

    private static String getRandomName() {
        String[] randomNames = {"Fluffy", "Fido", "Bruno", "Cracker", "Muffin"};
        return randomNames[(int) (Math.random() * randomNames.length)];
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Sugar");
        Animal another = new Animal();
        System.out.println(another.getName());
    }
}
