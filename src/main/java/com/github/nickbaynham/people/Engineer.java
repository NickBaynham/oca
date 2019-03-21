package com.github.nickbaynham.people;

import com.github.nickbaynham.skills.Repairing;
import com.github.nickbaynham.tools.Wrench;

public class Engineer extends Person implements Repairing {
    private Wrench wrench = new Wrench();

    public void repair(String device) {
        wrench.useOn(device);
    }
}
