package com.github.nickbaynham.oca.constructors;

public class Foo {
    protected Foo() {}
    protected void Foo() {
        System.out.println("Foo!!!!!");
    } // method, not a constructor

    public static void main(String... args) {
        Foo foo = new Foo();
        foo.Foo();
    }
}
