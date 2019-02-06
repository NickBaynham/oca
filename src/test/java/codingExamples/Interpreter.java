package codingExamples;

import org.junit.Test;

public class Interpreter {

    @Test
    public void test() {
        String example = "[I am instruction 1]instruction2";
        String instruction1 = example.substring(example.indexOf('['), example.indexOf(']') + 1);
        System.out.println(instruction1);
        String instruction2 = example.replace(instruction1, "");
        System.out.println(instruction2);
    }
}
