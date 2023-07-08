package com.hainiuxy.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
newCachedThreadPool  创建“可缓存线程池”
 */
public class Demo03 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        //提交任务
        for(int i=0;i<4;i++){
            final int j=i;
            executorService.submit(()->{
                System.out.println(Thread.currentThread().getName()+"线程执行"+j);
            });
            Thread.sleep(100);
        }
        //销毁线程
        executorService.shutdown();

    }
}
