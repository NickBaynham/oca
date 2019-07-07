package oca.chapter1;

import org.junit.Test;

public class Chick {
    private String name = "Fluffy"; // field initialization
    {
        System.out.println("Setting a field: " + name);
    }

    public Chick() {
        name = "Bob";
        System.out.println("Chick is initialized! " + name);
    }

    private void Chick() {
        name = "Timmy";
        System.out.println("Excuse me! I'm a method! " + name);
    }

    @Test
    public void testChick() {
        Chick chick = new Chick();
        System.out.println("Name is " + chick.name);
        chick.Chick();
        System.out.println("Oops! name is now " + chick.name);
    }
}
