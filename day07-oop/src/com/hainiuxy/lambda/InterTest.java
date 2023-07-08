package com.hainiuxy.lambda;



public class InterTest {
    public static void main(String[] args) {
        // 定义子类
        InterImpl ii = new InterImpl();
        test(ii);

        // 子类对象只使用一次，使用匿名内部类
        test(new Inter() {
            @Override
            public void show() {
                System.out.println("使用匿名内部类的方式重写了方法");
            }
        });

        // JDK8 lambda表达式
        test(() -> {
            // 要做的事情   其实就是重写父接口方法的 方法体
            System.out.println("使用lambda表达式的方式重写了方法");
        });

        // 多态
        Inter inter = () -> {
            // 要做的事情   其实就是重写父接口方法的 方法体
            System.out.println("使用lambda表达式的方式重写了方法");
        };

    }

    public static void test(Inter inter) {
        inter.show();
    }
















}
