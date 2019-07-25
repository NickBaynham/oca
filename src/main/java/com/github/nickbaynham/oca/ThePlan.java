package com.github.nickbaynham.oca;

public class ThePlan {
    public static void main(String[] args) {
        int plan = 1;
        plan = plan++ + --plan;
        if (plan == 1) {
            System.out.println("Plan A");
        } else {
            if (plan == 2) {
                System.out.println("Plan B");
            } else System.out.println("Plan C");
        }
    }
}
