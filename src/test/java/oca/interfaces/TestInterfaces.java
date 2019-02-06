package oca.interfaces;

import com.github.nickbaynham.oca.*;
import org.junit.Test;

public class TestInterfaces {
    @Test
    public void test() {
        CenteredRectangle centeredRectangle = new CenteredRectangle(1.0, 2.0, 3.0, 4.0);
        double centerX = centeredRectangle.getCenterX();
        double centerY = centeredRectangle.getCenterX();
        double area = centeredRectangle.area();
        centeredRectangle.setCenter(2.0, 3.0);
        double circumference = centeredRectangle.circumference();
        double height = centeredRectangle.getHeight();
        double width = centeredRectangle.getWidth();

        System.out.println("Center: [" + centerX + "," + centerY + "]" + " Area: " + area);
        System.out.println("Circumference: " + circumference);
        System.out.println("Height: " + height + " Width: " + width);
    }

    @Test
    public void test2() {
        Shape[] shapes = new Shape[3];
        shapes[0] = new CenteredCircle(1.0, 1.0, 1.0);
        shapes[1] = new CenteredSquare(2.5, 2.0, 3.0);
        shapes[2] = new CenteredRectangle(2.3, 4.5, 3, 4);

        double totalArea = 0;
        double totalDistance = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();

            if (shape instanceof Centered) {
                Centered centered = (Centered) shape;
                double cx = centered.getCenterX();
                double cy = centered.getCenterY();
                totalDistance += Math.sqrt(cx*cx + cy*cy);
            }
        }
        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Distance: " + totalDistance);
    }
}
