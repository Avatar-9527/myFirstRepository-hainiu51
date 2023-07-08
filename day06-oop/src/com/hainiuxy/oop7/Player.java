package com.hainiuxy.oop7;

public abstract class Player  extends  Person{

    private  String email;
    public Player() {
    }
    public Player(String name, int age,String email) {
        super(name, age);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
