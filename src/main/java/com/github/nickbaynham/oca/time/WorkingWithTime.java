package com.github.nickbaynham.oca.time;
import java.time.*;
public class WorkingWithTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();

        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());

        LocalDate myBirthday = LocalDate.of(1963, 8, 27);
        myBirthday = LocalDate.of(1963, Month.AUGUST, 27);

        LocalTime appointment = LocalTime.of(9, 30);
        LocalDateTime weeklyAppointment = LocalDateTime.of(2019, Month.AUGUST, 6, 10, 30);
        LocalDateTime saveTheDate = LocalDateTime.of(localDate, localTime);

        try {
            LocalDate aNewDate = LocalDate.of(2019, Month.APRIL, 31);
        } catch (DateTimeException e) {
            System.out.println("An exception will occur if the date is invalid.");
        }

        LocalDate nextBirthday = LocalDate.of(2019, Month.AUGUST, 27);
        System.out.println("I was born on: " + nextBirthday.minusYears(56));
    }
}
