package oca.oop;

import com.github.nickbaynham.oca.TrigCircle;
import org.junit.Test;

public class TestTrigCircle {
    @Test
    public void test() {
        double[] cosines = TrigCircle.getCosines();
        double[] sines = TrigCircle.getSines();
        for (double cosine : cosines) System.out.println(cosine);
        for (double sine : sines) System.out.println(sine);

        TrigCircle trigCircle = new TrigCircle();
        System.out.println(trigCircle.getMeaningOfLife());
    }
}
