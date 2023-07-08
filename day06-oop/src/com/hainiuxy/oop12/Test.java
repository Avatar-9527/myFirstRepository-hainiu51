package com.hainiuxy.oop12;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;

public class Test {
    public static void main(String[] args) {

        int age=0;
        //调用方法时  发现方法的参数是接口  那就试用匿名内部类实现接口  简化开发(参数只使用一次)
        useSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("我们去游泳吧");
            }
        });


    }

    //方法的参数是一个接口   -- 调用方法  传递的是接口的·子类对象
    public static void useSwimming(Swimming swimming){  //Swimming swimming new SwimmingImpl();

        swimming.swim();
    }
}
