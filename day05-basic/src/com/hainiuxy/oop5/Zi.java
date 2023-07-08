package com.hainiuxy.oop5;

public class Zi extends Fu{


    // 子类不能重写父类的私有方法
//    @Override
    private void show(){



    }

    //编译出错 子类重写父类方法时，子类权限必须大于等于父类权限
//    @Override
//    private void method(){
//
//    }

    @Override
    public void method(){
        System.out.println("Zi类中method()方法被调用");
    }

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }



}
