package com.hiwijaya.time;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

/**
 * @author Happy Indra Wijaya
 */
public class ZoneTest {

    @Test
    void create(){

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId gmt = ZoneId.of("GMT");
        System.out.println(gmt);

        Set<String> availableIds = ZoneId.getAvailableZoneIds();
        availableIds.forEach(System.out::println);

    }

    @Test
    void zoneOffset(){

        ZoneOffset zoneOffset1 = ZoneOffset.of("+07");
        ZoneOffset zoneOffset2 = ZoneOffset.ofHours(7);
        ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(7, 30);

        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);
        System.out.println(zoneOffset3);
    }
}
