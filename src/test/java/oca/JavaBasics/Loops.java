package oca.JavaBasics;

import com.github.nickbaynham.examples.objects.Thing;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
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

    @Test
    public void iterators() {
        List<OtherThing> things = new ArrayList<>();
        things.add(new OtherThing("One"));
        things.add(new OtherThing("Two"));
        things.add(new OtherThing("Your Mom"));

        Iterator<OtherThing> it = things.iterator();
        while (it.hasNext()) {
            OtherThing nextThing = it.next();
            System.out.println(nextThing);
        }
    }

    @Test
    public void enhancedFor() {
        OtherThing[] things = new OtherThing[3];
        things[0] = new OtherThing("One");
        things[1] = new OtherThing("Two");
        things[2] = new OtherThing("Last");

        int x = 0;
        while (x < things.length) {
            System.out.println(things[x++]);
        }
    }

    @Test
    public void breakAndContinue() {
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0)
                continue;
            if (numbers[i] > 50) break;
            numbers[i] = 42;
        }

        for (int i : numbers) {
            System.out.println(i);
        }

    }

    @Test
    public void labelledLoops() {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            if (i == 5) continue;
            numbers[i] = i;

            if (i == 8) break;
        }

        for (int i : numbers) {
            System.out.println(i);
        }

        block: for (int i = 0; i < numbers.length; i++) {
            if (i == 3) continue block;
            System.out.println(numbers[i]);
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