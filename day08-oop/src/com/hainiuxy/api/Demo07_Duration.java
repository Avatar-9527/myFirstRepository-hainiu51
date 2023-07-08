package com.hainiuxy.api;

import java.time.Duration;
import java.time.LocalDateTime;

public class Demo07_Duration {
    public static void main(String[] args) {

        //时间间隔   开始时间  当前时间
        Duration duration = Duration.between(LocalDateTime.of(1999,07,14,5,12,23),LocalDateTime.now());
        long l = duration.toNanos();
        String s = duration.toString();
        System.out.println(l);
        System.out.println(s);


    }
}
