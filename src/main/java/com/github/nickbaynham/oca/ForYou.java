package com.github.nickbaynham.oca;

public class ForYou {
    public static void main(String[] args) {
        for (int x = 0, y = 4;x < 10;x++, y--) {
            if (y < 0) continue;
            System.out.println("(" + x + ", " + y + ")");
        }
        int x = 0;
        for (boolean state = false;state; ) {
            x++;
            if (x > 10) state = true;
        }
    }
}
