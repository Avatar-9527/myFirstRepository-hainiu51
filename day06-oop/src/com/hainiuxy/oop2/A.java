package com.hainiuxy.oop2;

public class A extends Student{
    public static void main(String[] args) {
        final Student s = new Student(23);
        System.out.println(s.getAge());
        //final 修饰的对象 不可赋值
//        s = new Student();
        s.setAge(24);

        System.out.println(s.getAge());
    }
}
