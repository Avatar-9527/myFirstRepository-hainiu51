package com.hainiuxy.thread1;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor01 {
    public static void main(String[] args) {

        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,
                5,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        for(int i=0;i<10;i++) {
            pool.submit(() ->
                    System.out.println(Thread.currentThread().getName() + "线程任务执行" +
                            new Random().nextInt(100)));


        }

    }
}
