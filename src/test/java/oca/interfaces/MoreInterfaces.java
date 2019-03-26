package oca.interfaces;

import com.github.nickbaynham.tools.Pencil;
import org.junit.Test;

public class MoreInterfaces {
    @Test
    public void test() {
        Person person = new Person();
        int numberOfPages = person.writeSomething(new Pencil());
        System.out.println("A person wrote " + numberOfPages + " pages.");
        CanAlsoWrite writer = person;
        writer.doSomethingElse();
        writer.writeSomething();
        numberOfPages += writer.writeSomething(new Pencil());
        System.out.println(numberOfPages);
    }
}

class Person implements CanAlsoWrite, CanWrite {

    @Override
    public int writeSomething(Pencil pencil) {
        pencil.write("I'm writing a letter...");
        return PAGES + 1;
    }

    public void writeSomething(){}
    public void doSomethingElse(){}
}

interface CanWrite {
    int PAGES = 0;

    int writeSomething(Pencil pencil);
    void writeSomething();
}

interface CanAlsoWrite extends CanWrite {
    void doSomethingElse();
}