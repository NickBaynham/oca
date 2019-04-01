package oca.abstractClasses;

import org.junit.Test;

public class TestAbstract {

    @Test
    public void test() {
        Animal animal;
        // animal = new Animal();
        // animal = new Feline();
        animal = new Lion();
        System.out.println(animal.likesToEat());
    }
}

abstract class Animal {
    private static final int legs = 0;
    Animal() {
        System.out.println("New Animal");
    }

    abstract String likesToEat();
}

abstract class Feline extends Animal {
    private static final int legs = 0;
    Feline() {
        super();
    }
}


final class Lion extends Feline{
    Lion() {
        super();
    }
    String likesToEat() {
        return "meat";
    }
}