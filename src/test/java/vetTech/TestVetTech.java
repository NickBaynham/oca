package vetTech;

import com.github.nickbaynham.vetTech.Dog;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestVetTech {
    @Test
    public void test() {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Fido",100, 3));
        dogs.add(new Dog("Bruno", 120, 2));
        dogs.add(new Dog("Wolfie", 60, 1));

        System.out.println("All dogs: " + dogs);
    }
}
