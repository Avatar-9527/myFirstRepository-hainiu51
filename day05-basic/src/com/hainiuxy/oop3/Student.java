package com.hainiuxy.oop3;

public class Student {
    private String name;
    private int age;

    //构造方法   系统默认无参构造方法
    public Student(){
        System.out.println("构造方法构造成功");
    }

    //手动编写构造方法  有参构造方法    系统不会再提供默认的无参构造方法
    public Student(String name ,int age){
        this.name = name;
        this.age = age;
        System.out.println("我是Student类的构造方法");


    }

    public void setName(String name){
       this.name = name;

    }

    public String getName(){

        return name;
    }
    public void setAge(int age){
        this.age = age;

    }
    public int getAge(){

        return age;
    }
    public void show(){
        System.out.println(name + age);
    }







}
