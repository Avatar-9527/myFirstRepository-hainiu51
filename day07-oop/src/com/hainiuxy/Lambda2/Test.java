package com.hainiuxy.Lambda2;

public class Test {
    public static void main(String[] args) {
        //在主方法中调用useFlyable方法
        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });
        System.out.println("---------------");


        //Lambda
        useFlyable((String s)->{
            System.out.println("飞机自驾游");
        });



    }
    public static void useFlyable(Flyable flyable){
        //方法有参数   调用时传参

        flyable.fly("风和日丽 适合飞行");


    }
}
