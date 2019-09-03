package com.github.nickbaynham.oca;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ExceptionRules {
    int ii;
    public static void main(String[] args) {
        int hundred = 100;
        float ten = 10;
        short one = 1;
        char c = 'a';
        System.out.println(++c);
    }
}

class SuperDuper {
    void doSomething() {

    }
}

class Subbie extends SuperDuper {
    void doSomething() throws RuntimeException {

    }
}
