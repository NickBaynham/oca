package com.github.nickbaynham.oca;

import java.util.Date;

public class UsingDates {
    public static void main(String[] args) throws InterruptedException {
        Date date; String greeting;
        date = new Date();
        greeting = "Hello!";
        System.out.println(date + " " + greeting);
        Thread.sleep(10000);
        System.out.println(new Date() + " What's new?");
    }
}
