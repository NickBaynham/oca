package com.github.nickbaynham.oca;

import java.util.ArrayList;
import java.util.List;

public class Egg {
    private Egg() {
        number = 5;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        Egg egg = new Egg();
        list.add(egg.toString());
        System.out.println(egg.number);
        System.out.println(list.get(0));

    }

    private int number = 3;
    { number = 4; }
}
