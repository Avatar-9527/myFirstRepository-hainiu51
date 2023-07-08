package com.hainiuxy.Lambad1;

public class Test {
    public static void main(String[] args) {


        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃桃子");
            }
        });


        //Lambda 表达式
        useEatable(()->{
            System.out.println("吃苹果");
        });






    }
    //场景  有一个函数式接口  有一个使用该接口作为参数的方法
    public static void useEatable(Eatable eatable){

        eatable.eat();

    }

}
