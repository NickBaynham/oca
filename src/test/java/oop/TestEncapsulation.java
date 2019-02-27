package oop;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestEncapsulation {
    @Test
    public void test() {
        ExampleOne one = new ExampleOne();
        one.add("An Item");
        one.add("Second Item");
        List<String> myList = one.get();
        myList.add("Last Item");
        System.out.println(one.get());

        one = new ExampleTwo();
        one.add("An Item");
        one.add("Second Item");
        myList = one.get();
        myList.add("Item for example two");
        System.out.println(one.get());

    }
}

class ExampleOne {
    private List<String> myThings;
    ExampleOne() {
        myThings = new ArrayList<>();
    }

    void add(String item) {
        myThings.add(item);
    }
    public List<String> get() {
        return myThings;  // not encapsulated, since user can change the object via the reference
    }
}

class ExampleTwo extends ExampleOne {
    ExampleTwo() {
        super();
    }

    public List<String> get() {
        return new ArrayList<>(super.get());
    }
}
