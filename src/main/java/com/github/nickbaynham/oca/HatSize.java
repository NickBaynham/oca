package com.github.nickbaynham.oca;

public class HatSize extends Size implements Choosable {

    HatSize() {

        // Do Hat Size Intialization Stuff Here

    }

    public static final HatSize EXTRA_SMALL = new HatSize("EXTRA_SMALL", 0);
    public static final HatSize SMALL = new HatSize("SMALL", 1);
    public static final HatSize MEDIUM = new HatSize("MEDIUM", 2);
    public static final HatSize LARGE = new HatSize("LARGE", 3);

    private HatSize(String enumName, int index) {

    }

    public void select() {
        // select a Hat Size
    }

    public void enable() {
        Choosable.super.enable();           // we can call the overridden interface default method
    }

    public Size getRestrictedSizes(Size size) {
        // restrict a Hat Size
        return size;
    }

    public static void main(String[] args) {

        HatSize hatSize = new HatSize();
        System.out.println(HatSize.LARGE.getRestrictedSizes(hatSize));
        hatSize.select();
        hatSize.enable();
        int status = Choosable.getStatus();
    }
}

abstract class Size {
    Size() {
        // do initializing sizing stuff
    }
}

interface Choosable extends Restrictable {              // causes another interface contract to be required when this one is declared as required
    void select();

    default void enable() {
        // enable some imagined thing for Choosing and don't think too deeply about it...
    }

    static int getStatus() {
        return 0;
    }
}

interface Restrictable {
    Size getRestrictedSizes(Size size);
}