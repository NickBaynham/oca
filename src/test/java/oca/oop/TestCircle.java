package oca.oop;

import com.github.nickbaynham.oca.Circle;
import org.junit.Test;

public class TestCircle {

    @Test
    public void testCircle() {
        Circle circle = new Circle(2.0);
        double area = circle.area();
        System.out.println(area);
        double circumference = circle.circumference();
        System.out.println(circumference);
        double degrees = Circle.radiansToDegrees(300);
        System.out.println(degrees);

        circle.setRadius(circle.getRadius() * 2.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.area());
        System.out.println("Circumference: " + circle.circumference());

        Circle c = new Circle();
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}
