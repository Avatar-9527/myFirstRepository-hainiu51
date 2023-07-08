package com.hainiuxy.decorator;

public class Test {
    public static void main(String[] args) {
        InterImplZi interImplZi = new InterImplZi();
        interImplZi.sayHello();
        interImplZi.sayGoodbye();

        System.out.println("-------------------");

        InterImpl2 interImpl2 = new InterImpl2(new InterImpl1());

        interImpl2.sayHello();
        interImpl2.sayGoodbye();

    }

}
