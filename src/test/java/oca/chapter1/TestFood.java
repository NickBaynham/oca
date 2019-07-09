package oca.chapter1;

import com.github.nickbaynham.oca.food.Fruit;
import com.github.nickbaynham.oca.specificFood.Apple;
import org.junit.Test;

public class TestFood {
    private Fruit fruit = new Apple();

    @Test
    public void test() {
        System.out.println(fruit);
    }
}
