package com.github.nickbaynham.oca;

public class CastTest2 {
    private static Animal[] animals = {new Dog(), new Cat(), new Cat(), new Dog()};

    public static void main(String[] args) {
        for (Animal a : animals) {
            a.makeNoise();
            if (a instanceof Dog) {
                ((Dog) a).playDead();
            }
        }
    }
}

abstract class Animal {
    abstract void makeNoise();
}

class Dog extends Animal {
    void makeNoise() {
        System.out.println("Woof!");
    }

    void playDead() {
        System.out.println("Playing dead");
    }
}

class Cat extends Animal {
    void makeNoise() {
        System.out.println("Meow!");
    }
}
