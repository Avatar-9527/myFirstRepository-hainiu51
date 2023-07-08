package com.hainiuxy.lambda;

/**
 * @author SHI
 */
public class InterImpl implements Inter {

    @Override
    public void show(){
        System.out.println("定义子类实现接口的方法，重写了方法");

    }

    //静态方法  传入接口对象参数，  接口中方法 只能通过子类对象调用
    // 子类对象.方法      多态？  父类引用指向子类对象
//    public static void test(Inter inter){
//
//        inter.show();
//    }
}
