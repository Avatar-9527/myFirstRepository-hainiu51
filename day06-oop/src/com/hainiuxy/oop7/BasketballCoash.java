package com.hainiuxy.oop7;

public class BasketballCoash extends Coach {


    public BasketballCoash(String name, int age, String email) {
        super(name, age, email);
    }

    @Override
    public void work(){
        System.out.println("蓝球教练打篮球");
    }
}
