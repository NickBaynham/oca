package com.github.nickbaynham.oca.datetimeformatters;

import java.time.*;
import java.time.format.*;

public class Formatters {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2019, Month.JULY, 31);
        LocalTime localTime = LocalTime.of(8,04);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        String formattedLocalDateTime = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(formattedLocalDateTime);
        String formattedLocalDate = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(formattedLocalDate);

        // Short and Medium

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalTime appointment = LocalTime.now().plusHours(4);
        LocalDateTime appointmentTomorrow = LocalDateTime.of(tomorrow, appointment);

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println(shortFormat.format(appointmentTomorrow));
        System.out.println(mediumFormat.format(appointmentTomorrow));

        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("(hh:mm -> MMMM dd, yyyy)");
        System.out.println(customFormat.format(appointmentTomorrow));

        // Parsing Dates

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", formatter);
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(date));

        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
    }
}
