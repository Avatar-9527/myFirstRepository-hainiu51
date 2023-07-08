package com.hainiuxy.Demo05;
/*
通常情况引起死锁的原因是不正确的锁嵌套
 */
public class Demo {
    public static void main(String[] args) {

//        new Thread(new Runnable(){
//            @Override
//            public void run(){
//                System.out.println("线程执行");
//            }
//
//        }).start();
//
//        new Thread(()->{
//
//        }).start();

        Object lock1 = new Object();
        Object lock2 = new Object();


        //第一条线程  首先获取1锁  在获取2锁

        new Thread(()->{
            synchronized(lock1){
                System.out.println(Thread.currentThread().getName()+"获取到1锁");
                synchronized(lock2){
                    System.out.println(Thread.currentThread().getName()+"获取到2锁");

                }
            }


        }).start();
        new Thread(()->{
            synchronized(lock2){
                System.out.println(Thread.currentThread().getName()+"获取到2锁");
                synchronized(lock1){
                    System.out.println(Thread.currentThread().getName()+"获取到1锁");

                }
            }


        }).start();


    }
}
