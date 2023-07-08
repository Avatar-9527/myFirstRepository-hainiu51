package com.hainiuxy.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * try {
         * 	可能出现异常的代码;
         * } catch(异常类名 变量名) {
         * 	异常的处理代码;
         * }
         *
         * 1、首先执行try中的代码，如果没有异常，那么将try中所有语句执行完毕，不影响后续代码执行
         * 2、如果try中的代码出现异常，并且catch语句能够捕获这个异常，那么try的后续代码将不再执行，进入catch语句，不影响后续代码执行
         *
         */
public class Demo02 {
    public static void main(String[] args) {


        int[] arr = new int[3];

        try {
            System.out.println(arr[5]); // 运行时异常
        } catch (Exception e) {
            System.out.println("捕获到了索引越界");
        }


        System.out.println(1);


        System.out.println(2);



        String str = "2023-06-18 10:50:00";
        // 模式必须与字符串格式一致
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy、MM-dd HH:mm:ss");

        Date d = null;

        try {
            d = sdf2.parse(str); // 编译时异常  JVM会自动创建一个该异常的对象 new ParseException("异常信息");
        } catch (ParseException e) {
            System.out.println("捕获到异常");
        }


        System.out.println(d);
    }
}
