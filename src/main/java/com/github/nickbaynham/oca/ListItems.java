package com.github.nickbaynham.oca;

import java.util.ArrayList;
import java.util.List;

public class ListItems {
    public static void main(String[] args) {
        List differentTypes = new ArrayList();
        differentTypes.add("Goldfish");
        differentTypes.add(0, false);
        differentTypes.add(1);
        differentTypes.remove(1);
        System.out.println(differentTypes);
        System.out.println(differentTypes.contains("Goldfish"));
        System.out.println(differentTypes.contains(new Boolean(false)));
        System.out.println(differentTypes.contains(1));
        System.out.println(differentTypes.contains(false));
    }
}
