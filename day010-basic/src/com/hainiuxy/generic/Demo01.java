package com.hainiuxy.generic;

import java.util.ArrayList;
import java.util.List;

/*
   List 元素可以是任意类型   设置为Object类型
 */
public class Demo01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();


//        String a = "abcd";
//        String a1 = "abcde";
//        System.out.println(a1.compareTo(a));
        list.add("hello");
        //类型转换异常   ClassCastException
//        list.add(120);

        for (String s:list) {
            System.out.println(s);
            System.out.println(s.length());
        }




    }
}
