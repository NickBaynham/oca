package oca.chapter1.interfaces;

public interface Bounceable {
    int LIFE_MEANING = 42;
    void bounce();
    void setBounceFactor(int bf);
    default void bounceIt(int x, int y) {
        // complex stuff to make a bounce
        setBounceFactor(2);
        System.out.println("Bouncing...");
    }

    static void bounceBack() {
        System.out.println("Bouncing back...");
    }
}
