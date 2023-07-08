package com.hainiuxy.oop6;

public interface Inter {


    //默认方法

    default int add(int a,int b){
        return a + b;
    }

    //静态方法
    static void show(){
        System.out.println("static show()");

    }





}
