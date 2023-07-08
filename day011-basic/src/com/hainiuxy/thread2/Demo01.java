package com.hainiuxy.thread2;

public class Demo01 {
    public static void main(String[] args) {
        //创建线程对象 在构造方法传递的参数，启动线程时会调用对象的run方法
        MyRunnable myRunnable = new MyRunnable();

        //创建线程对象
        Thread thread1 = new Thread(myRunnable,"a");

        thread1.setDaemon(true );
        //开启线程
//        thread1.setPriority(10);
        thread1.start();

        //在创建一条线程  当前案例第二条线程与第一条线程方法完成的任务一样不用重写new MyRunnable对象

        Thread thread2 = new Thread(myRunnable,"aaa");
//        thread2.setPriority(1);

        thread2.start();
    }
}
