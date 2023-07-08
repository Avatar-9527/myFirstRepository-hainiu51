package com.hainiuxy.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo05 {
    public static void main(String[] args) {
        try {
            test();
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
    public static void test() throws ParseException {
        String str = "2023-06-18 10:50:00";
        //模式必须与字符串格式一致

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        Date parse = simpleDateFormat.parse(str);
        System.out.println(parse);


    }
}
