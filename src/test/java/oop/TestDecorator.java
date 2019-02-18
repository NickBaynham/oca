package oop;

import org.junit.Test;

public class TestDecorator {
    @Test
    public void test() {
        StandardBurrito standardBurrito = new StandardBurrito();
        System.out.println("Standard Burrito price is: " + standardBurrito.getPrice());

        SuperBurrito superBurrito = new SuperBurrito();
        System.out.println("Super Burrito price is: " + superBurrito.getPrice());

        Burrito lunch = new Jalapeno(new Guacamole(new SuperBurrito()));
        System.out.println("Lunch cost: " + lunch.getPrice());
    }
}

interface Burrito {
    double getPrice();
}

class StandardBurrito implements Burrito {

    private static final double BASE_PRICE = 5.99;

    public double getPrice() {
        return BASE_PRICE;
    }
}

class SuperBurrito implements Burrito {
    private static final double BASS_PRICE = 6.99;

    public double getPrice() {
        return BASS_PRICE;
    }
}

abstract class BurritoOptionalExtra implements Burrito {
    private final Burrito burrito;
    private final double price;

    BurritoOptionalExtra(Burrito toDecorate, double myPrice) {
        burrito = toDecorate;
        price = myPrice;
    }

    public final double getPrice() {
        return (burrito.getPrice() + price);
    }
}

class Jalapeno extends BurritoOptionalExtra {
    private static final double BASS_PRICE = 0.99;
    Jalapeno(Burrito toDecorate) {
        super(toDecorate, BASS_PRICE);
    }
}

class Guacamole extends BurritoOptionalExtra {
    private static final double BASS_PRICE = 1.49;
    Guacamole(Burrito toDecorate) {
        super(toDecorate, BASS_PRICE);
    }
}