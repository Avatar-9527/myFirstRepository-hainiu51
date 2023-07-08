package com.hainiuxy.oop2;

public class Student {

    //私有成员变量
    String name;
    private int age;


    //set get 方法
    public void setAge(int a){
        if(a<0 || a>120){
            System.out.println("输入有误");
        }else{
            age = a;

        }


    }

    public int getAge(){
        return age;



    }



    //




}
