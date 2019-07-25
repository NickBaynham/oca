package com.github.nickbaynham.oca;

public class Coffee {
    private CoffeeSize size;

    public static void main(String[] args) {
        Coffee drink = new Coffee();
        drink.size = CoffeeSize.BIG;
        System.out.println("Customer ordered a coffee with size: " + drink.size);

        for (CoffeeSize cs: CoffeeSize.values()) {
            System.out.println(cs + " " + cs.getOunces());
        }
    }
}
