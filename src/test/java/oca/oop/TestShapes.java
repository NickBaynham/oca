package oca.oop;

import com.github.nickbaynham.oca.*;
import org.junit.Test;

public class TestShapes {
    @Test
    public void test() {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(1.0, 3.0);
        shapes[2]= new Rectangle(4.0, 2.0);

        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        System.out.println("Total Area: " + totalArea);
    }

    @Test
    public void castingMadness() {
        Object[] objects = new Object[5];
        objects[0] = new Object();
        objects[1] = "Hello, World!";
        objects[2] = 42;
        objects[3] = "Goodbye!";

        for (Object object : objects) {
            if (object instanceof String) {
                System.out.println(object);
            }
            if (object instanceof Integer) {
                System.out.println("The meaning of Life!");
            }
        }
    }
}
