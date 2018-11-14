package oca.chapter6;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class Calendars {

    @Test
    public void test() {

        // only factory methods are available to create new objects
        LocalDate localDate = LocalDate.of(2018,8, 27);
        System.out.println(localDate);
        Period period = Period.ofMonths(1);
        localDate = localDate.plus(period);
        System.out.println(localDate);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMddyyyy");
        LocalDate birthday = null;
        try {
            birthday = LocalDate.parse("08271963", f);
        } catch (Exception e) {
            System.out.println("An Exception Occurred.");
        }

        System.out.println("My Birthday is " + birthday);

        // functionally preventing nulls'
        Optional<LocalDate> optionalDate = Optional.ofNullable(localDate);
        optionalDate
                .map(LocalDate::getDayOfWeek)
                .ifPresent(System.out::println);

        // more date stuff

    }

    @Test
    public void dateTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMddyyyy");
        LocalDate birthday = null;
        try {
            birthday = LocalDate.parse("08271963", dateTimeFormatter);
        } catch (Exception e) {
            System.out.println("An Exception has occurred");
            System.out.println(e.getMessage());
        }

        System.out.println("My Birthday is: " + birthday);
        System.out.println("It's on a " + birthday.getDayOfWeek().toString().toLowerCase());

        Period p1 = Period.between(birthday, LocalDate.now());
        System.out.println("I've been alive for " + p1.getYears() + " years.");
        System.out.println(p1.getMonths() + " months.");
        System.out.println(p1.getDays() + " days.");

        long tDays = birthday.until(LocalDate.now(), ChronoUnit.DAYS);
        System.out.println("Which of the " + tDays + " days did you like best?");
    }
}
