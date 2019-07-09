package oca.chapter1.interfaces;

public class Ball implements Bounceable {
    public void bounce() {
        System.out.println("Ball has Bounced");
    }

    public void setBounceFactor(int bf) {
        System.out.println("Setting bounce factor to: " + bf);
    }

    public void bounceIt(int x, int y) {
        setBounceFactor(2);
        System.out.println("I am bouncing down the street...");
    }
}
