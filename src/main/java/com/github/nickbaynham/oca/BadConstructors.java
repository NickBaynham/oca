package com.github.nickbaynham.oca;

public class BadConstructors {
    private BadConstructors() {
        super();
    }

    BadConstructors(int a) {
        this();
    }
}
