package com.hainiuxy.api2;

public class Demo01_StringBuiler {
    public static void main(String[] args) {

        String s= "Hello";
        StringBuilder stringBuilder = new StringBuilder();

        // 返回值就是调用方法的对象   链式编程 -- 对象调用方法返回了对象，那么就可以继续打点调用返回值的方法
        stringBuilder.append("World").append(10).append(true).append(new Object());
        // 追加数据 : 数据在一个对象中追加
        System.out.println(stringBuilder);
        stringBuilder.append("hello");
        System.out.println(stringBuilder);
        stringBuilder.insert(1,s);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.toString();
        System.out.println(stringBuilder);

    }
}
