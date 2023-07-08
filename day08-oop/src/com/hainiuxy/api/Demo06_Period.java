package com.hainiuxy.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Demo06_Period {
    public static void main(String[] args) {
        //日期间隔
        //日期
        LocalDate now = LocalDate.now();
        System.out.println(now);
        //日期时间
        LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate date = LocalDate.of(1999,7,14);

        Period period = Period.between(date,now);
        //P23Y11M4D   23年11月  4天
        System.out.println(period);
        System.out.println(period.toTotalMonths());
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
}
