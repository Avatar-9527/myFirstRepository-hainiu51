package com.hainiuxy.decorator;

/*
装饰模式


 */
public class InterImpl2 implements Inter{

    //把要增强的类 定义为私有成员变量
    private InterImpl1 interImpl1;

    //通过构造方法 将 被增强的对象传递过来
    public InterImpl2(InterImpl1 interImpl1){
        this.interImpl1=interImpl1;
    }

    @Override
    public void sayHello(){
        interImpl1.sayHello();
        System.out.println("拥抱一下");
    }
    @Override
    public void sayGoodbye(){
        interImpl1.sayGoodbye();
        System.out.println("走掉");
    }

}
