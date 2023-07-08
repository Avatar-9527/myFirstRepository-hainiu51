package com.hainiuxy.thread3;

import java.util.Random;
import java.util.concurrent.Semaphore;

/*
Semaphore  信号标
 */
public class Demo02 {
    public static void main(String[] args) {

        //同事允许访问共享资源的线程数量
        Semaphore semaphore = new Semaphore(2);

        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                //获取许可证


                try {
                    semaphore.acquire(); //如果获取不到  阻塞


                    System.out.println(Thread.currentThread().getName()+ "获取到许可证，开始执行任务。。。");


                    Thread.sleep(new Random().nextInt(1000));


                    System.out.println(Thread.currentThread().getName() + "归还许可证。。。");



                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    //任务完成  释放许可证  保证许可证可以被释放   放入finally语句中
                    semaphore.release();
                }


            }).start();
        }

    }
}
