import com.github.nickbaynham.people.Engineer;
import com.github.nickbaynham.people.Journalist;
import com.github.nickbaynham.people.RadioOperator;
import org.junit.Test;

public class testSkills {
    @Test
    public void test() {
        Engineer john = new Engineer();
        Journalist jane = new Journalist();
        RadioOperator janet = new RadioOperator();

        john.repair("toaster");
        jane.write("article on toaster repair");
        janet.transmitAMessage("Jane is writing an article on John's toaster repairs");
    }
}
