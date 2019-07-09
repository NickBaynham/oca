package oca.chapter1;

import oca.chapter1.interfaces.Ball;
import oca.chapter1.interfaces.Bounceable;
import oca.chapter1.interfaces.Tire;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInterfaces {

    @Test
    public void test() {
        Ball ball = new Ball();
        Tire tire = new Tire();
        List<Bounceable> bounceables = new ArrayList<>();
        bounceables.add(ball);
        bounceables.add(tire);
        for (Bounceable b : bounceables) {
            b.setBounceFactor(4);
            b.bounce();
            b.bounceIt(1, 2);
            Bounceable.bounceBack();
        }
    }
}
