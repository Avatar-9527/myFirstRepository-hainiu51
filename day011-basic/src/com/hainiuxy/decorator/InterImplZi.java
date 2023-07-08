package com.hainiuxy.decorator;

/*
继承是一种强耦合
 */

public class InterImplZi extends InterImpl1 {


    @Override
    public void sayHello(){
        //如果还想用父类方法
        super.sayHello();
        //添加新的方法
        System.out.println("拥抱一下");
    }

    @Override
    public void sayGoodbye(){
        super.sayGoodbye();
        System.out.println("头也不回的走掉了");
    }
    public static void main(String[] args) {

    }
}
