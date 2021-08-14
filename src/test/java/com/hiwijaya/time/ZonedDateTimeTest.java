package com.hiwijaya.time;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * @author Happy Indra Wijaya
 */
public class ZonedDateTimeTest {

    @Test
    void name() {

        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Jakarta"));
        ZonedDateTime zonedDateTime3 = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime zonedDateTime4 = ZonedDateTime.now(ZoneOffset.ofHours(5));

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
        System.out.println(zonedDateTime4);

    }

    @Test
    void parsing() {

        // default pattern yyyy-MM-ddTHH:mm:ss.nano(+/-)Offset[ZoneId]
        // ZoneId is not require
        // if ZoneId is set then offset value will be ignored
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("1980-12-10T10:10:10+07:00[Asia/Jakarta]");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("1980-10-10T10:10:10+05:00");

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);

    }

    @Test
    void changeZoneId(){

        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);

        // change ZoneId WITHOUT effecting date and time value
        ZonedDateTime zonedDateTime2 = zonedDateTime1.withZoneSameLocal(ZoneId.of("GMT"));

        // change ZoneId with effecting date and time value
        ZonedDateTime zonedDateTime3 = zonedDateTime1.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
    }
}
