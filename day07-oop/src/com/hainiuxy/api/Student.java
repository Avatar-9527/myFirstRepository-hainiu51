package com.hainiuxy.api;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


       /*
        用 == 比较数据
            基本数据类型  比较数值
            引用数据类型 比较引用地址
     */


    //equals
    @Override
    public boolean equals(Object o) { //this 与 o 比较
        //// 为了提高效率 如果两个对象引用相同 那么一定是同一个对象
        if (this == o) return true;

        //如果参数为空，或者 两个对象的创建类不同， 一定不相等
        if (o == null || getClass() != o.getClass()) return false;

        //向下转型
        Student student = (Student) o;
        //比较两个对象的具体属性
        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }


    //hashcode
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        //乘数越大，越不容易冲突
        result = 31 * result + age;
        return result;
    }

    //

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
