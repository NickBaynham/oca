package testExamples;

import com.github.nickbaynham.examples.objects.Thing;
import org.junit.Test;

public class TestThing {
    @Test
    public void test() {
        Thing thing = new Thing();
        System.out.println(thing.celsius);
        thing.setF(50);
        System.out.println(thing.celsius);
    }
}
