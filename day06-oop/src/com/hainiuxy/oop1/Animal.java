package com.hainiuxy.oop1;

public  abstract class Animal {
    String a = "a";

    //无参构造
    public Animal(){

    }
    //有参
    public Animal(String n){

    }


    public void drink(){
        System.out.println("喝水");

    }


    public abstract void eat();
    /* 一个抽象的方法用abstract修饰  以下修饰符不可以使用

    final
    static
    private


        */

}
