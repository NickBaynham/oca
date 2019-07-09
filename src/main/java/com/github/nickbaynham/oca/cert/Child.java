package com.github.nickbaynham.oca.cert;

import com.github.nickbaynham.oca.certification.Parent;

public class Child extends Parent {
    private void testIt() {
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.testIt();
        System.out.println(child.x);
        System.out.println(Parent.y);
    }
}
