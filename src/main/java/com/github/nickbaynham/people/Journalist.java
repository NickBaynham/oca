package com.github.nickbaynham.people;

import com.github.nickbaynham.skills.Writing;
import com.github.nickbaynham.tools.Pencil;

public class Journalist extends Person implements Writing {
    private Pencil pencil = new Pencil();

    public void write(String message) {
        pencil.write(message);
    }
}
