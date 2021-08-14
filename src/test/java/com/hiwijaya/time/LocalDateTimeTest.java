package com.hiwijaya.time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author Happy Indra Wijaya
 */
public class LocalDateTimeTest {

    @Test
    void create(){

        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(1992, Month.JULY, 10, 15, 9, 10,456000000);
        LocalDateTime localDateTime3 = LocalDateTime.parse("1980-01-08T10:09:10.456");  // yyyy-MM-ddTHH:mm:ss.nano

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);

    }

    @Test
    void withModify() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.withYear(1992).withMonth(2);
        LocalDateTime localDateTime3 = localDateTime1.withYear(1992).withHour(5);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void manipulate() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.plusYears(1).minusHours(12);
        LocalDateTime localDateTime3 = localDateTime1.minusYears(2).plusHours(6);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void get() {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getNano());
    }

    @Test
    void date() {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);

        LocalDateTime result = localDate.atTime(10, 10, 10, 10);
        System.out.println(result);

    }

    @Test
    void time() {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

        LocalDateTime result = localTime.atDate(LocalDate.now());
        System.out.println(result);

    }
}
