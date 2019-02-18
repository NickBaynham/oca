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
    }
}
