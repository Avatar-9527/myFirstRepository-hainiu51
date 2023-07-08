package com.hainiuxy.oop4;

public class Fu {
    //静态代码块
    static {
        System.out.println("Fu static code block");
    }

    //构造代码块
    {

        System.out.println("Fu constructor code block");
    }

    //局部代码块
    public Fu(){

        System.out.println("Fu constructor code block");
    }
}
