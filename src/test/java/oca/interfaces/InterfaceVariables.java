package oca.interfaces;

import javafx.scene.image.Image;
import org.junit.Test;

public class InterfaceVariables {

    @Test
    public void test() {
        Photographer photographer;
        System.out.println(Photographer.x);
    }
}


interface Photographer {
    int x = 99;

    Image takePhoto();
}
