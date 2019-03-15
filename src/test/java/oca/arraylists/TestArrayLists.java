package oca.arraylists;
import java.util.*;

import org.junit.Test;

public class TestArrayLists {
    @Test
    public void test() {
        String[] cities = {"Oslo", "London", "Paris", "Berlin"};

        List<String> c = new ArrayList<>();
        c.add("Oslo");
        c.add("London");
        c.add("Rome");
        c.add("Paris");
        int index = c.indexOf("Rome");
        System.out.println(c + " " + index);
        c.add(index, "Berlin");
        System.out.println(c + " " + c.indexOf("Berlin"));
        c.clear();
        c.add("z");
        c.add(0,"x");
        c.add(1, "y");
        System.out.println(c);
        if (c.contains("x")) System.out.println("C contains X");
        c.remove(0);
        if (! c.contains("x")) System.out.println("C no longer contains X");
        System.out.println("Size is " + c.size());
    }

    @Test
    public void testArrays() {
        List<Integer> myList = new ArrayList<>();
        myList.add(new Integer(5));
        myList.add(42);
        // myList.add("113");
        myList.add(new Integer("7"));
        System.out.println(myList);
    }
}
