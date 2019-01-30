package oca.JavaBasics.objects;

import org.junit.Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaExpressions {

    @Test
    public void lambdas() {
        Runnable r = () -> System.out.println("Hello, World!");

        r.run();

        ActionListener listener = (e) -> {
          System.out.println("Event fired at: " + e.getWhen());
          System.out.println("Event command: " + e.getActionCommand());
        };
    }
}
