package oca.chapter1.interfaces;

public class Tire implements Bounceable {
    public void bounce() {
        System.out.println("Tire is bouncing...");
    }

    public void setBounceFactor(int bf) {
        System.out.println("Setting bounce factor for tire to: " + bf);
    }
}
