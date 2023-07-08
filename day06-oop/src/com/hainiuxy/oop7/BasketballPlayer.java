package com.hainiuxy.oop7;

public class BasketballPlayer extends Player {


    public BasketballPlayer(String name, int age, String email) {
        super(name, age, email);
    }

    @Override
    public void work(){
        System.out.println("蓝球运动员打蓝球");
    }

}
