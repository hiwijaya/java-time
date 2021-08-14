package com.hiwijaya.time;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

/**
 * @author Happy Indra Wijaya
 */
public class LocalTimeTest {

    @Test
    void create(){

        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(13, 30, 40);    // hour and minute are mandatory
        LocalTime localTime3 = LocalTime.parse("21:30");    // default pattern HH:mm:ss.nano

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);

    }

    @Test
    void withModify(){

        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.withHour(10);
        LocalTime localTime3 = localTime1.withHour(12).withMinute(30).withSecond(15);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);

    }

    @Test
    void manipulate(){

        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.plusHours(5);
        LocalTime localTime3 = localTime1.minusHours(1).minusMinutes(20);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);

    }

    @Test
    void get(){

        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());

    }
}
