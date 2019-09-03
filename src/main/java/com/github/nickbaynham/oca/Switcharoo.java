package com.github.nickbaynham.oca;

public class Switcharoo {
    public static void main(String[] args) {
        AA a = new AA();
        System.out.println(a.i + a.j);
    }
}

class AA {
    int i = 6;
    int j = i;
    AA() {
        i = 5;
    }
}
