package com.hainiuxy.oop3;

public class Zi extends Fu{
    public void method(){
        System.out.println("method方法");
    }

    public static void main(String[] args) {
        //创建一个对象
        Fu fu = new Fu();
        //调用父类方法
        fu.show();

        Zi zi = new Zi();
        //调用自己的方法
        zi.method();
        //继承父类方法
        zi.show();


    }


}
