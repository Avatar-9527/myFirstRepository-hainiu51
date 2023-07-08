package com.hainiuxy.api;

/*
*   字符串的值不可变，可以共享使用。频繁使用，节省内存
* */
public class Demo02_String {
    public static void main(String[] args) {
        String s = "Hello World";
        s +="java";
        System.out.println(s);
        String s1 = "abc";
        String s2 = "abc";
        int a1 = 2;
        int a2 = 2;
        System.out.println(a1==a2);
        System.out.println(s1==s2);
    }
}
