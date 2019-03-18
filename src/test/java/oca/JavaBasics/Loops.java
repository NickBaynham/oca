package oca.JavaBasics;

import com.github.nickbaynham.examples.objects.Thing;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Loops {

    @Test
    public void test() {
        for (int i = 0, j = i + 5, a[][] = new int[100][] ;
             i < 100; i++) {
            System.out.println("This is OK: " + i);
            System.out.println("Also: " + j);
        }

        int p = 0; Thing t = new Thing();
        for (t.doStuff(), p = 99, new OtherThing(""); p < 105; p++) {
            System.out.println("Looping");
        }
    }

    @Test
    public void test2() {
        List<OtherThing> things = new ArrayList<>();
        things.add(new OtherThing("One"));
        things.add(new OtherThing("Two"));
        things.add(new OtherThing("Your Mom"));

        // enhanced For loop

        for (OtherThing thing : things) {
            System.out.println(thing);
        }
    }
}

class OtherThing {
    private String thing;
    OtherThing(String thing) {
        this.thing = thing;
    }

    public String toString() {
        return thing;
    }
}