package com.hainiuxy.thread03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建目标任务对象


        MyCallable myCallable = new MyCallable();

        //FutureTask 负责获取线程执行完毕得到的结果
        FutureTask<String> futureTask = new FutureTask<String>(myCallable);

        //创建线程对象并启动

        Thread t1= new Thread(futureTask);
        t1.start();
        FutureTask<String> futureTask2 =new FutureTask<>(myCallable);
        Thread t2 =new Thread(futureTask2);
        //在开启一条  任务相同

        t2.start();


        //在开启线程之后获取结果

        String s = futureTask.get(); //阻塞式执行  等待线程执行完毕 获得结果
        System.out.println(s);



        String s2 = futureTask2.get();
        System.out.println(s2);
    }
}
