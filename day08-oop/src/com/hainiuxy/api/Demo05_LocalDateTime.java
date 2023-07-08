package com.hainiuxy.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo05_LocalDateTime {
    public static void main(String[] args) {
        //当前系统时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //指定时间
//        LocalDateTime dateTime = LocalDateTime.of()

        //日期格式化类  获取对象
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //格式化为字符串
        String s = formatter.format(localDateTime);
        System.out.println("将日期格式化为字符串"+s);

        System.out.println("------------------------");

        //将字符串格式化日期对象

        String str = "2023年06月18日 21:13:56";
        // parse方法 第一个参数是要解析的字符串  第二个参数是与这个字符串相同的模式
        //第一个参数是要解析的字符串  第二个参数是与这个字符串相同的模式
        //日期这个类获取对象的一种方式   把这个格式当成参数
        LocalDateTime localDateTime1 =LocalDateTime.parse(str,DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss"));
        System.out.println(localDateTime1);




    }
}
