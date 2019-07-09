package oca.chapter1;

public class Moo extends Zoo {
    public void useMyCoolMethod() {
        System.out.println(coolMethod());
    }

    public static void main(String[] args) {
        Moo moo = new Moo();
        moo.useMyCoolMethod();
    }
}

class Zoo {
    String coolMethod() {
        return "Wow baby";
    }
}