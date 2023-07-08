package com.hainiuxy.api;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 *  LocalDateTime 日期和时间
 *  * LocalDate 日期
 *  * LocalTime 时间
 *  *
 *  * 1、创建对象
 *  * 2、获取日期某个字段的值
 *  * 3、将日期对象中的某个字段的值推移指定的时间
 */

public class Demo04_LocalDateTime {
    public static void main(String[] args) {

        //获取日历
        Date date =new Date();
        System.out.println(date);

        //当前系统时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        String str = "2023-06-18 10:50:00";

        System.out.println();

        //获取对象  当前日期年月日时分秒
        LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println(localDateTime);

        //有参传入时间
        LocalDateTime localDateTime2 = LocalDateTime.of(1999,07,14,20,45,23);
        System.out.println(localDateTime2);

        //获取日期中某个字段的值
        System.out.println("获取日期中某个字段的值");
        System.out.println(localDateTime.getYear());
        //JUNE
        System.out.println(localDateTime.getMonth());
        //6  整数类型
        System.out.println(localDateTime.getMonthValue());

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());


        //将日期对象中的某个字段的值推移指定的时间
        LocalDateTime localDateTime1 = localDateTime.plusYears(20);
        System.out.println(localDateTime1);



    }
}
