package com.github.nickbaynham.people;

import com.github.nickbaynham.skills.Writing;
import com.github.nickbaynham.tools.Pencil;

public class Journalist extends Person implements Writing {
    private Pencil pencil = new Pencil();

    public Journalist(String name, int age) {
        super(name, age);
    }

    public void write(String message) {
        pencil.write(message);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
