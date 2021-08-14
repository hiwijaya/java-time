package com.hiwijaya.time;

import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * @author Happy Indra Wijaya
 */
public class DateTest {

    @Test
    void create(){
        var date1 = new Date();
        var date2 = new Date(System.currentTimeMillis());
        var date3 = new Date(1628872233485L);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }

}
