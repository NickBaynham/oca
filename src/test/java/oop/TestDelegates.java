package oop;

import org.junit.Test;

public class TestDelegates {

    @Test
    public void test() {
        Manager manager = new Manager(new Programmer());
        manager.work();
    }

}

// A situation you see often in Software Companies modelled in Java

interface Employee {
    void work();
}

class Programmer implements Employee {
    public void work() {
        System.out.println("I will do it right away, Master!");
    }
}

class Manager implements Employee {
    private Employee report;

    Manager(Employee staff) {
        report = staff;
    }

    public void setReport(Employee staff) {
        report = staff;
    }

    public void work() {
        report.work();
    }
}
