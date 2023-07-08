package com.hainiuxy.decorator;

public class InterImpl1 implements Inter {

    @Override
    public void sayHello(){
        System.out.println("打个招呼");
    }

    @Override
    public void sayGoodbye(){
        System.out.println("撒由那拉");
    }
}
