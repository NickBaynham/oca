package exercises;

import org.junit.Assert;
import org.junit.Test;

import static exercises.StaticAlgorithms.reverse;

public class Recursive {
    @Test
    public void test() {
        String test = "Hello Marco!";
        Assert.assertEquals("!ocraM olleH", reverse(test));
    }
}

class StaticAlgorithms {
    static String reverse(String str) {
        if (str.length() > 1) {
            return str.substring(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
        } else {
            return str;
        }
    }
}
