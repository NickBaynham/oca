package com.github.nickbaynham.oca;

import com.github.nickbaynham.accessmodifiers.ProtectedMember;

public class ProtectedMembers extends ProtectedMember {
    private final String NAME;
    private ProtectedMembers() {
        NAME = "Bob";
    }

    public String getName() {
        return NAME;
    }
    public static void main(String[] args) {
        ProtectedMember pm1 = new ProtectedMember();
        ProtectedMembers pm2 = new ProtectedMembers();
        ProtectedMember pm3 = new ProtectedMembers();

        // System.out.println("pm1="+pm1.name);
        System.out.println("pm2="+pm2.name);
        // System.out.println("pm3="+pm3.name);

    }
}