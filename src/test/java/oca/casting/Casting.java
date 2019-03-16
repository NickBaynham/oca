package oca.casting;

import org.junit.Test;
import static org.junit.Assert.*;

public class Casting {

    @Test
    public void test() {
        int x = 21;
        byte b = (byte) x;
        assertEquals(b, 21);
    }
}
