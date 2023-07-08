package com.hainiuxy.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
### Executors创建线程的方法

1 **newSingleThreadExecutor创建“单线程化线程池”**
 */
public class Demo01 {
    public static void main(String[] args) {

        //创建单线程化线程池  -- 池中的唯一线程时永久存在的
        //通过 Executors的静态方法  获取到线程的执行者服务对象
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //提交任务   通过执行者服务对象执行线程服务

        for(int i = 0;i<10;i++){
            //内部类或者lambda表达式使用方法内的局部变量  需要final 修饰
            final int j= i;
            executorService.submit(()-> System.out.println("线程执行"+j));

        }

//        executorService.submit(()->{
//            System.out.println("线程任务执行");
//        });

        //销毁线程池
        executorService.shutdown();


    }
}
