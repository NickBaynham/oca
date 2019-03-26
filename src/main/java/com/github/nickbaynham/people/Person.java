package com.github.nickbaynham.people;

public class Person {
    private String name;
    private int age;

    Person() {
        name = "";
        age = 0;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
