package com.hiwijaya.time;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

/**
 * @author Happy Indra Wijaya
 */
public class LocalTimeTest {

    @Test
    void test(){

        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(13, 30, 40);    // hour and minute are mandatory
        LocalTime localTime3 = LocalTime.parse("21:30");    // default pattern HH:mm:ss.nano

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);

    }
}
