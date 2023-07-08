package com.hainiuxy.objio;


/*
一个对象想要被序列化，该对象所属的类必须实现serializable接口
是一个标记接口，实现该接口  不需要重写任何方法
 */

import java.io.Serializable;

public class Student implements Serializable {

    //定义成员变量  固定 serialVersionUID的值
    private static final long serialVersionUID=1L;

    private String name;
    private int age;

//    private int id;
    //对象的某些属性  不想参与序列化  瞬态
    private transient double salary;

    public Student() {
    }



    public Student(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
