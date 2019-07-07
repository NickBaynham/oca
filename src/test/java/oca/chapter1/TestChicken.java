package oca.chapter1;

import com.github.nickbaynham.oca.Chicken;
import org.junit.Test;

public class TestChicken {
    @Test
    public void testChicken() {
        // code block
        {
            System.out.println("Testing...");
        }
        Chicken chicken = new Chicken();
        chicken.addAnEgg();
        chicken.addAnEgg();
        System.out.println(chicken.getName() + " has " + chicken.getNumEggs() + " eggs.");
    }

    // class initializer

    static {
        System.out.println("Initializing...");
    }

    // instance initializer

    {
        System.out.println("We have an object...");
    }
}


