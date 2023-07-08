package com.hainiuxy.regex;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        String s = "aaa,bbb,ccc";
//        //逗号
//
//        String[] arr = s.split(",");
//        System.out.println(arr.length);
//        System.out.println(Arrays.toString(arr));//逗号

        //.  匹配任意字符
        String[] arr = s.split("\\.");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //字符串"boo:and:foo",使用正则表达式":"进行拆分，得到{"boo", "and", "foo"}
        //	字符串"boo:and:foo",使用正则表达式"o"进行拆分，得到{"b", "", ":and:f"}
        //		中间连续的两个"o"匹配,拆分出一个空串，而结尾处的两个"o"匹配，得到的空串不会保留。
        System.out.println(Arrays.toString(arr));

    }
}
