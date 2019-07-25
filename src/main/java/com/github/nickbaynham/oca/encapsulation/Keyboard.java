package com.github.nickbaynham.oca.encapsulation;

public class Keyboard {
    private static boolean numLock = true;
    static boolean capLock = false;

    public static void main(String... shortcuts) {
        System.out.print(numLock+" "+capLock);
    }
}
