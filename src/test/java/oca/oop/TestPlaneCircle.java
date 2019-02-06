package oca.oop;

import com.github.nickbaynham.oca.Circle;
import com.github.nickbaynham.oca.PlaneCircle;
import org.junit.Test;

public class TestPlaneCircle {

    @Test
    public void test() {
        PlaneCircle planeCircle = new PlaneCircle(1.0, 2.0, 3.0);
        System.out.println(planeCircle.getCenterX());
        System.out.println(planeCircle.getCenterY());
        System.out.println(planeCircle.isInside(3.0, 4.0));
        System.out.println(planeCircle.area());
        System.out.println(planeCircle.circumference());
        System.out.println(planeCircle.getRadius());

        // Assignment without casting

        Circle c = planeCircle;
        System.out.println(c.circumference());
        System.out.println(c.area());

        PlaneCircle pc = (PlaneCircle) c;
        System.out.println(pc.circumference());
        System.out.println(pc.area());
    }
}
