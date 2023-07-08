package com.hainiuxy.oop5;

public interface A1 {


//    public abstract  void test1();


    //默认方法  不是抽象方法  不强制重写重写   但可以被重写   重写时
    //重写时 去掉default关键字  ？？去掉不就是不是default 方法L了？

    default void walk(){
        System.out.println("东走");

    }



}
