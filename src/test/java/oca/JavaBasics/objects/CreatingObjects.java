package oca.JavaBasics.objects;

import com.github.nickbaynham.oca.Point;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class CreatingObjects {

    @Test
    public void createAnObject() {
        Point point = new Point(2.0, -3.5);
        Date date = new Date();
        Set words = new HashSet();
        System.out.println(point.distanceFromOrigin());
    }

    @Test
    public void useClass() {
        Class<?> typeInt = int.class;
        Class<?> typeIntArray = int[].class;
        Class<?> typePoint = Point.class;

        System.out.println(typeInt.getName());
        System.out.println(typeIntArray.getCanonicalName());
        System.out.println(typePoint.getConstructors().length);
    }
}
