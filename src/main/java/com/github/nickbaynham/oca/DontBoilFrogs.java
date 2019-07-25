package com.github.nickbaynham.oca;

interface FrogBoilable {
    static int getCtoF(int cTemp) {
        return (cTemp * 9 / 5) + 32;
    }

    default String hop() { return "hopping"; }
}

public class DontBoilFrogs implements FrogBoilable {
    public static void main(String[] args) {
        new DontBoilFrogs().go();
    }

    void go() {
        System.out.print(hop());
        // System.out.println(getCtoF(100));  <--- You can't do that!
        System.out.println(FrogBoilable.getCtoF(100));  // note the format to invoke the static interface method
        DontBoilFrogs d = new DontBoilFrogs();
        // System.out.println(d.getCtoF(100));   <---- Can't do this either!
    }
}
