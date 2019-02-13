package oca.generics;

import com.github.nickbaynham.oca.Centered;
import com.github.nickbaynham.oca.CenteredCircle;
import com.github.nickbaynham.oca.CenteredSquare;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
    @Test
    public void test() {
        List<Object> shapes = new ArrayList<>();
        shapes.add(new CenteredCircle(1.0, 1.0, 1.0));
        shapes.add(new CenteredSquare(2.5, 2, 3));

        if (shapes.get(0) instanceof CenteredCircle) {
            CenteredCircle c = (CenteredCircle)shapes.get(0);
        }

        for (Object c : shapes) {
            System.out.println(((Centered)c).getCenterX());
        }
    }

    @Test
    public void genericsTest() {
        List<CenteredCircle> shapes = new ArrayList<>();
        shapes.add(new CenteredCircle(1.0, 1.0, 1.0));
        shapes.add(new CenteredCircle(2.0, 2.0, 3.0));

        for (CenteredCircle centeredCircle : shapes) {
            System.out.println(centeredCircle.getCenterX());
        }
    }
}
