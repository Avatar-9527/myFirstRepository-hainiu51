package com.hainiuxy.homework;

public class Test_static {

    static {

        x=2; //静态代码块随着类的加载执行 x=2；
    }

    private static int x= 1,y; // 默认初始化  x=0;y=0  显式初始化x=1，将静态代码块的赋值  覆盖

    public static  void main(String[] args){
        change();
        System.out.println(x); //x=2
        System.out.println(y); //y=-1

    }

    public static  void change(){
        x++;
        y--;


    }
}
