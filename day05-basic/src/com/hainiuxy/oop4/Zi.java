package com.hainiuxy.oop4;

public class Zi extends Fu {
//    int num =20;

    //定义自己的方法
    public void show(){
        int num = 30;
        System.out.println(num);
    }

    public static void main(String[] args){
        Zi zi = new Zi();
        System.out.println(zi.num);

        zi.show();


    }

}
