package oca.enums;

import com.github.nickbaynham.oca.PrimaryColor;
import org.junit.Test;

public class TestEnums {
    @Test
    public void test() {
        PrimaryColor blue = PrimaryColor.BLUE;
        if (blue.equals(PrimaryColor.BLUE)) {
            System.out.println("It was blue.");
        }
    }
}
