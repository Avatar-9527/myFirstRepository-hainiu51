package com.hainiuxy.thread02;

import com.hainiuxy.threadpool.Demo02;

import java.util.concurrent.atomic.AtomicInteger;

/*
        检查原子性
        AtomicInteger 实现原子性  依赖CAS算法  比较并交换  乐观锁  synchronized 悲观锁
 */
public class Demo01 {

    //操作的共享资源
//    public static int num =10;

    //保证原子性   原子性的更新int的值
    private static AtomicInteger num = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++){
            new Thread(()->{
//                //每条线程让变量自增1万次
                for(int j=0;j<10000;j++){
//                    synchronized(Demo02.class){
//                        num++;
//                    }

                    num.incrementAndGet();
                }
            }).start();


        }
        Thread.sleep(1000);
        System.out.println(num.get());

    }
}
