package com.hainiuxy.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*

public ThreadPoolExecutor(int corePoolSize,						// 核心线程数量
                          int maximumPoolSize,					// 最大线程数量
                          long keepAliveTime,					// 空闲线程存活时间（值）
                          TimeUnit unit,						// 空闲线程存活时间（单位）
                          BlockingQueue<Runnable> workQueue,	// 阻塞队列
                          ThreadFactory threadFactory,			// 新线程的创建工厂（产生方式）
                          RejectedExecutionHandler handler)		// 拒绝策略

 */
public class Demo04 {
    public static void main(String[] args) {

        //线程池的标准创建方式
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                5,
                10,
                20,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),  //默认 创建线程的工厂
//                new ThreadPoolExecutor.AbortPolicy()  //拒绝任务  抛出异常
//                new ThreadPoolExecutor.CallerRunsPolicy()//绕过线程池  调用run方法
//               new ThreadPoolExecutor.DiscardOldestPolicy() //丢弃等待时长最久的 任务
                new ThreadPoolExecutor.DiscardPolicy() //静默的拒绝任务  （不建议）
        ) ;

        for(int i =0;i<16;i++){
            final int j=i;
            executor.submit(()->{
                System.out.println(Thread.currentThread().getName()+"线程执行"+j);
            });


        }
        executor.shutdown();

    }
}
