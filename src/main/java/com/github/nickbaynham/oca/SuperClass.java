package com.github.nickbaynham.oca;

class SuperClass {
    final void doIt() {
        System.out.println("Doing it!");
    }

    public static void main(String[] args) {  // a Static method cannot be declared final
        Subclass sub = new Subclass();
        sub.aMethod(); // you can invoke method of the sub class that in turn invokes the inherited class
        sub.doIt();   // you can invoke inherited methods
        sub.doIt("And loving it!");         // We can overload a final method in the sub class, by giving a different method signature
    }
}

final class Subclass extends SuperClass {
    private String msg;       // class cannot be inherited since it is final
    void aMethod() {
        doIt();  // you can call the final method, inherited but you can't override it
    }
    void doIt(String msg) {
        this.msg = msg;
        System.out.println("I'm doing it, " + msg);   // we can overload the final method of the super class
    }
}

