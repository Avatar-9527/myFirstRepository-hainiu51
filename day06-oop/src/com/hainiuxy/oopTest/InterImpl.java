package com.hainiuxy.oopTest;

public class InterImpl implements Inter {

    @Override
    public void show(){
        System.out.println("实现类，重写接口方法的实现");
    }


    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.show();
        }
}
