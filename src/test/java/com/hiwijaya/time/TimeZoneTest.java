package com.hiwijaya.time;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * @author Happy Indra Wijaya
 */
public class TimeZoneTest {

    @Test
    void create(){

        TimeZone currentTimeZone = TimeZone.getDefault();
        System.out.println(currentTimeZone);

        TimeZone timeZoneGMT = TimeZone.getTimeZone("GMT");
        System.out.println(timeZoneGMT);

        String[] availableIDs = TimeZone.getAvailableIDs();
        Arrays.asList(availableIDs).forEach(System.out::println);

    }

    @Test
    void calendar(){

        Calendar jakartaCalendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
        Calendar GMTCalendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(jakartaCalendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(GMTCalendar.get(Calendar.HOUR_OF_DAY));

        jakartaCalendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(jakartaCalendar.get(Calendar.HOUR_OF_DAY));

    }

}
