package oca.chapter1;

import com.github.nickbaynham.examples.objects.Animal;
import org.junit.Test;

public class TestAnimal {

    @Test
    public void testAnimal() {
        Animal animal;
        animal = new Animal();
        animal.setName("Fido");
        System.out.println(animal.getName());
    }

    @Test
    public void testAnimalNotInitialized() {
        Animal animal = new Animal();
        System.out.println("An animal has no name: " + animal.getName());
    }

    @Test
    public void testRandom() {
        System.out.println(new Animal().random(10));
    }
}
