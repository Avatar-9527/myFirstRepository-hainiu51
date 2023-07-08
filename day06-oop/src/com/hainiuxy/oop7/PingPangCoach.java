package com.hainiuxy.oop7;

public class PingPangCoach extends Coach implements LearnEnglish {
    public PingPangCoach() {
    }
    public PingPangCoach(String name , int age, String email){
        super(name, age, email);
    }


    @Override
    public void work(){
        System.out.println("乒乓球教练教打乒乓球");
    }
    @Override
    public void StudyEnglish(){
        System.out.println("乒乓球教练学习英文");
    }


}
