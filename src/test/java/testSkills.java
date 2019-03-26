import com.github.nickbaynham.people.Engineer;
import com.github.nickbaynham.people.Journalist;
import com.github.nickbaynham.people.Person;
import com.github.nickbaynham.people.RadioOperator;
import com.github.nickbaynham.skills.RadioTransmitting;
import com.github.nickbaynham.skills.Repairing;
import com.github.nickbaynham.skills.Writing;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class testSkills {
    @Test
    public void test() {
        Engineer john = new Engineer("John", 33);
        Journalist jane = new Journalist("Jane", 21);
        RadioOperator janet = new RadioOperator("Janet", 42);

        john.repair("toaster");
        jane.write("article on toaster repair");
        janet.transmitAMessage("Jane is writing an article on John's toaster repairs");

        System.out.println("The Engineer is called " + john.getName());
        System.out.println("No really, What is the Engineer's name? " + ((Person) john).getName());

        List<Person> people = new ArrayList<>();
        people.add(john);
        people.add(jane);
        people.add(janet);
        people.add(john);

        for (Person aPerson : people) {
            System.out.print(aPerson.getName() + ", " + aPerson.getAge());
            if (aPerson instanceof Engineer) System.out.print(", Engineer");
            if (aPerson instanceof Journalist) System.out.print(", Journalist");
            if (aPerson instanceof RadioOperator) System.out.print(", Radio Operator");

            // Perform a Task

            if (aPerson instanceof RadioTransmitting) System.out.println(" is sending a message.");
            if (aPerson instanceof Repairing) System.out.println(" is repairing something.");
            if (aPerson instanceof Writing) System.out.println(" is writing a new article.");
        }

        Writing writer = new Journalist("Samantha", 47);
        people.add((Person) writer);
        Repairing repairMan = new Engineer("Mary", 66);
        people.add((Person) repairMan);
        RadioTransmitting radio = new RadioOperator("Jake", 19);
        people.add((Person) radio);

        for (Person aPerson : people) {
            System.out.print(aPerson.getName() + ", " + aPerson.getAge());
            if (aPerson instanceof Engineer) System.out.print(", Engineer");
            if (aPerson instanceof Journalist) System.out.print(", Journalist");
            if (aPerson instanceof RadioOperator) System.out.print(", Radio Operator");

            // Perform a Task

            if (aPerson instanceof RadioTransmitting) System.out.println(" is sending a message.");
            if (aPerson instanceof Repairing) System.out.println(" is repairing something.");
            if (aPerson instanceof Writing) System.out.println(" is writing a new article.");
        }

    }
}
