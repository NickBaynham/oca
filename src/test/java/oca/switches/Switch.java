package oca.switches;

import org.junit.Test;

public class Switch {

    @Test
    public void test() {
        final int TWELVE = 12;
        int x = 10;
        switch (x) {
            case 10:
                System.out.println("It was Ten");
                break;
            case 20:
                System.out.println("It is Twenty");
                break;
            case 10 + 5:
                break;
            case TWELVE:
                System.out.println("Constants are OK.");
            default:
                System.out.println("I don't know!");
        }
    }

    @Test
    public void test2() {
        String[] lastNames = {"Brown", "George", "Smith", "Jones", "Black", "Spender", "Flintstone", "Johnson", "Great", "Martin"};
        String name = "Fred " + lastNames[(int) (Math.random() * 10)];
        switch(name) {
            case "Fred George":
                System.out.println("Hello again Fred!");
                break;
            case "Fred Brown":
                System.out.println("Are you Fred?");
                break;
            default:
                System.out.println("It's a pleasure to meet you " + name + "!");
        }
    }
}
