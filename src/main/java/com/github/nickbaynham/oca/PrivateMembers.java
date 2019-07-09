package com.github.nickbaynham.oca;

public class PrivateMembers {
    public static void main(String[] args) {
        A a = new A();
        a.setValue(a);
        a.showValue();
        B b = new B(99);
        b.showValue();
    }
}

class A {
    private int a;
    void showValue() {
        System.out.println(a);
    }

    void setValue(A a) {
        a.a = 100;
    }
}

class B {
    private int b;

    B(int b) {
        setValue(b);
    }

    private void setValue(int b) {
        this.b = b;
    }

    void showValue() {
        System.out.println(b);
    }
}
