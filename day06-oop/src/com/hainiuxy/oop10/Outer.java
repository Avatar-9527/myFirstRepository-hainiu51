package com.hainiuxy.oop10;

public class Outer {

    public void fun(){
        //局部内部类 是方法中定义的类  方法没有访问权限修饰符

        class Inter{
            private String name;
            public String getName(){
                return name;
            }
            public void setName(String name){
                this.name = name;
            }

        }
        //局部内部类  在方法中使用
        Inter inter = new Inter();
        inter.setName("Tom");

        System.out.println(inter.getName());
    }
}
