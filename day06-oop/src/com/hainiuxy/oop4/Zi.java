package com.hainiuxy.oop4;

public class Zi {

    //静态代码块
    static {
        System.out.println("Zi static code block");
    }

    //构造代码块
    {

        System.out.println("Zi constructor code block");
    }

    //局部代码块
    public Zi(){

        System.out.println("Zi constructor code block");
    }
}

