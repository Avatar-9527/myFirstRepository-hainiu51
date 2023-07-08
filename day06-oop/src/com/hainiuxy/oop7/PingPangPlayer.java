package com.hainiuxy.oop7;

public class PingPangPlayer extends Player implements LearnEnglish{

    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age, String email) {
        super(name, age, email);
    }


    public void work(){
        System.out.println("乒乓球运动员打乒乓球");
    }

    @Override
    public void StudyEnglish(){
        System.out.println("乒乓球运动员学英语");
    }
}
