package vetTech;

import com.github.nickbaynham.vetTech.Dog;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestVetTech {
    @Test
    public void test() {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Fido",100, 3));
        dogs.add(new Dog("Bruno", 120, 2));
        dogs.add(new Dog("Wolfie", 60, 1));

        System.out.println("All dogs: " + dogs);
    }

    @Test
    public void testDog() {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Fido",100, 3));
        dogs.add(new Dog("Bruno", 120, 2));
        dogs.add(new Dog("Wolfie", 60, 1));

        System.out.println("All dogs: " + dogs);
        System.out.println("All dogs 3 years and above: " + minAge(dogs, 3));
        System.out.println("All dogs 100lbs and above: " + minWeight(dogs, 100));

        System.out.println("Dogs at least 2 years old: " + dogFilter(dogs, d -> d.getAge() >= 2));
        System.out.println("Dogs at least 50lbs: " + dogFilter(dogs, d -> d.getWeight() >= 50));
    }

    private static List<Dog> minAge(List<Dog> dogs, int testFor) {
        List<Dog> result = new ArrayList<>();
        for (Dog dog : dogs) {
            if (dog.getAge() >= testFor) {
                result.add(dog);
            }
        }
        return result;
    }

    private static List<Dog> minWeight(List<Dog> dogs, int testFor) {
        List<Dog> result = new ArrayList<>();
        for (Dog dog : dogs) {
            if (dog.getWeight() >= testFor) {
                result.add(dog);
            }
        }
        return result;
    }

    // Refactor using Predicate

    private static List<Dog> dogFilter(List<Dog> dogs, Predicate<Dog> filter) {
        List<Dog> result = new ArrayList<Dog>();
        for (Dog dog : dogs) {
            if (filter.test(dog)) {
                result.add(dog);
            }
        }
        return result;
    }
}
