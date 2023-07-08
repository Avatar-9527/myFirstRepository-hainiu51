package com.hainiuxy.oop9;

public class InnerTest {
    public static void main(String[] args) {
        Inter inter = new Inter();
        inter.fun();

        //直接访问内部类
        /*
        * 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
        * */

        Inter.N n = new  Inter().new N();
        n.test();



        //访问一个类的静态内部类

        Inter.StaticInnerClass  ii = new Inter.StaticInnerClass();
        ii.show();


        Inter.StaticInnerClass.method();

    }
}
