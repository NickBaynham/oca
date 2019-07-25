package com.github.nickbaynham.oca;

class Person {

    static int pid;
    String name;
    int age;

    Person(String s, int i) {
       ++pid;
       name=s;
       age=i;
    }
}

class Tester {
    public static void main(String[] args) {
        Person p1 = new Person("John", 22);
        Tester te = new Tester();
        Person p2 = te.change(p1);
        System.out.print(p2.pid + " " + p2.name + " " + p2.age);
        System.out.print(p1.pid + " "+p1.name + " " + p1.age);
    }

    private Person change(Object o) {
        Person p2 = (Person) o;
        p2.age = 25;
        return p2;
    }
}


