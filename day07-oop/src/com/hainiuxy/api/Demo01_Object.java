package com.hainiuxy.api;

public class Demo01_Object {


    public static void main(String[] args) {
        //创建对象
        Object obj = new Object();

         /*
        判断调用方法的对象和参数对象是否相等，如果相等返回true
        默认比较引用（地址值）是否相等，即是否是同一个对象；
        子类一般会重写该方法，用于比较具体的属性值
        */
        Student s1 = new Student("Tom",20);
        Student s2 = new Student("Tom",20);
        //引用地址相同 必相等
        System.out.println(s1.equals(s2));


/*
        返回对象的哈希码值。
        该哈希值默认根据对象的地址值计算。其特点为：
        如果两个对象使用equals方法比较，返回为true，则他们的hashCode一定相同；
        (引用地址相同，hashCode一定相同)
        反之，如果两个对象使用equals方法比较，返回为false，则不会要求他们的hashCode一定不同；
        但为不同的对象，生成不同的hashCode值，会提高哈希表的性能。
        */

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


 /*
        返回对象的字符串表示形式。
        默认格式为：全限定类名（包名+类名） + “@” + hashCode的十六进制表示形式

        子类一般会重写该方法，返回该对象的具体属性值。

        这个方法也决定了在输出语句中打印一个对象时的结果，因为在输出语句中打印一个对象，
        其实就是打印该对象的字符串表示形式，也就是说默认调用了该对象的 toString()方法
        */
        System.out.println("---------------------");
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);

        int age =10;
        System.out.println("我的年龄是："+age);
        System.out.println("对象是："+new Object());

    }
}
