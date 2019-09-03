package testExamples;

import static testExamples.SameClassReference.*;
import com.github.nickbaynham.examples.SuperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class SameClassReference {
    private String color;

    public static void main(String[] args) {
        LocalDateTime ldt;
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30).plusMonths(-1).plusYears(20);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
        SameClassReference s = new SameClassReference();
        System.out.println(s.color);

        method(true, true);
        method(true, true, true, true);
    }

    private static void method(boolean a, boolean... b){};


}


class Sub extends SuperClass {
    void doSomething() {
        SuperClass s = new Sub();
        SuperClass su = new SuperClass();
        System.out.println(age);
        // System.out.println(s.age);  // protected
        // System.out.println(su.age); // protected
    }
}

