package com.hainiuxy.oop8;

public class Cat  extends Animal{

    int num = 20;


    //重写父类方法
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    //自己的方法
    public void drink(){
        System.out.println("猫喝水");

    }

}
