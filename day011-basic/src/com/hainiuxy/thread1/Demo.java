package com.hainiuxy.thread1;

public class Demo {
    public static void main(String[] args) {
        //在测试类中创建MyThread类  并调用start()方法启动线程

        MyThread myThread = new MyThread();
        myThread.setName("张三");
        myThread.start();  //申请系统资源  开启一条线程  自动调用run方法

        //main 方法执行所在的线程  主线程  在主线程上开启了一条新的线程

        //在创建一条线程  开启
        MyThread myThread1 = new MyThread();
        myThread1.setName("李四");
        myThread1.start();

    }
}
