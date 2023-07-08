package com.hainiuxy.oop5;

public class Student {

    //静态成员变量
   public  static String name ;

   //非静态成员变量

    private int id;
    private int age;

    //静态成员方法

    public static String getName(){
        return Student.name;
    }


    //静态代码块
    static{
        Student.name = "张三";

    }

    public static void main(String[] args) {
        Student.name = "李华";
        System.out.println(Student.name);

        String name = Student.getName();
        System.out.println(name);

    }


}
