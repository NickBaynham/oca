package oop;

import org.junit.Test;

public class TestSingleton {
    @Test
    public void test() {
        Singleton singleton = Singleton.getInstance();
    }
}

class Singleton {
    private final static Singleton instance = new Singleton();
    private static boolean initialized = false;

    private Singleton() {
        super();
    }

    private void init() {
        System.out.println("Initializing...");
    }

    public static synchronized Singleton getInstance() {
        if (initialized) return instance;
        instance.init();
        initialized = true;
        return instance;
    }
}
