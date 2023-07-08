package com.hainiuxy.oop5;

public class A  implements Inter{

    //子类  必须重写接口中的 方法  或者声明为抽象类
    @Override
    public void show(){
        System.out.println("接口方法实现");
    }


    public static void main(String[] args) {

//        接口中的常量默认为final 不可修改
//        a = 20;
       A a = new A();
       a.show();
    }

}
