package com.github.nickbaynham.oca;

public abstract class Abstract {
    native void execute();
    synchronized void go() {
        System.out.println("Going...");
    };
    abstract void stop();

    public static void main(String... args) {
        // Abstract abs = new Abstract();   <--- You cannot instantiate an abstract class!
        Abstract abs = new Concrete();     // You can get a reference to a subclass and treat it as an abstract, though
        abs.go();
        abs.stop();

        AnotherAbstract aa = new AnotherConcrete();
        aa.go();
        aa.pause();
        aa.go();
        aa.stop();
        // aa.execute();  <-- Will get an UnsatisfiedLinkError since the native code doesn't exist
    }
}

class Concrete extends Abstract {
    void stop() {
        System.out.println("I've stopped!");
    }
}

abstract class AnotherAbstract extends Abstract {
    abstract void stop();           // it's optional to declare the inherited abstract method in another abstract class
    abstract void pause();          // We can add additional abstract methods
}

strictfp class AnotherConcrete extends AnotherAbstract {        // class can be annotated as strict fp
    strictfp void stop(){
        System.out.println("I've stopped!");
    }
    void pause(){
        System.out.println("I'm pausing!");
    }
}