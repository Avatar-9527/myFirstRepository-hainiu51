package com.hainiuxy.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo02 {
    public static void main(String[] args) {
        //newFixedThreadPool  创建固定数量的线程池
        //每当提交一个任务   就开启一条新线程来执行  不管有没有空闲线程

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0;i<4;i++){
            int j=i;

            //提交任务
            executorService.submit(()->{
                System.out.println(Thread.currentThread().getName()+"线程执行"+j);
            });
        }
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }
}
