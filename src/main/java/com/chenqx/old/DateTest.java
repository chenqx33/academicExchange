package com.chenqx.old;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cqx
 * @date 2018/3/29 17:30
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat.format(simpleDateFormat.parse("0000-12-12")));
    }
}
