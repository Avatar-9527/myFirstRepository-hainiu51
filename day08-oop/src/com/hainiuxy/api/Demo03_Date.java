package com.hainiuxy.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03_Date {
    public static void main(String[] args) throws ParseException {

        // 创建日期对象 表示当前系统时间
        Date date = new Date();

        System.out.println(date);

        //// 获取日期对象所表示的毫秒值
        long time = date.getTime();

        System.out.println(time);

        date.setTime(date.getTime() +  24L*60*60*1000);

        System.out.println(date);
        System.out.println("--------------");

        // 日期对象和字符串之间的转换  日期对象--字符串
        // 格式化format    字符串--日期对象 解析parse
        //将日期对象  格式化为字符串   根据想要的格式对日期进行格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        //日期对象 --- 字符串  格式化format

        String s = sdf.format(date);
        System.out.println("日期对象格式化字符串后："+s);

        System.out.println("---------");

        String str = "2023-06-18 10:50:00";
        //模式必须与字符串格式一致
        SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sdf2);

        // parse方法 第一个参数是要解析的字符串
        // 第二个参数是与这个字符串相同的模式
        //将字符串解析为日期对象
        //解析时  必须与字符串 保持一致
        Date d = sdf.parse(str);
        System.out.println(d);









    }
}
