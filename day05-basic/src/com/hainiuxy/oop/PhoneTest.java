package com.hainiuxy.oop;

public class PhoneTest {
    //调用成员变量和方法
    public static void main(String[] args) {

        //创建对象
        Phone p = new Phone();
        //给成员变量进行赋值
        p.pinpai = "三星";
        p.price = 2000;
        //输出赋值后的成员变量
        System.out.println(p.pinpai+p.price);
        //调用成员方法
        p.call("李华");
        p.sendMessage();
    }


}
