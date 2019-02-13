package oca.annotations;

import com.github.nickbaynham.oca.Alias;
import org.junit.Test;

public class Annotations {
    @Test
    @Alias("Test")
    public void test() {
        System.out.println("Test");
    }
}

