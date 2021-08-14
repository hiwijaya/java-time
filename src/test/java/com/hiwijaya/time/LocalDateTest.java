package com.hiwijaya.time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Happy Indra Wijaya
 */
public class LocalDateTest {

    @Test
    void create() {

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(1992, Month.JULY, 10);
        LocalDate localDate3 = LocalDate.parse("2020-03-03");   // default pattern yyyy-MM-dd

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);

    }

    @Test
    void withModify() {

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.withYear(1992);
        LocalDate localDate3 = localDate1.withYear(1992).withMonth(7);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);

    }

    @Test
    void manipulate(){

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.plusDays(30);
        LocalDate localDate3 = localDate1.minusMonths(10);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);

    }

    @Test
    void get() {

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getYear());

    }
}
