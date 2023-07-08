package com.hainiuxy.thread3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/*

CountDownLatch  让某条线程等待其它线程执行

1.await ---谁等待
2.countDown -- 优先执行的线程  任务完毕
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        List<Integer> synchronizedList = Collections.synchronizedList(list);

        //定义计数器
        CountDownLatch countDownLatch = new CountDownLatch(3); //等待3条线程的执行

        //统计上述三条线程的计算结果
        new Thread(()->{
            //进入等待状态
            try {
                countDownLatch.await(); // 等到计数器为0
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sum=0;
            for (Integer num:list) {
                sum +=num;
            }
            System.out.println(sum);


        }).start();

        //开启三条线程
        for (int i = 0; i < 3; i++) {
            new Thread(()->{
                int sum=0;
                for (int j = 1; j <= 100; j++) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sum +=j;
                }

                synchronizedList.add(sum);
                //每条先执行的线程  当任务执行完毕  调用计数器的 计数器-1方法

                countDownLatch.countDown(); //计数器减少1
            }).start();
        }


    }
}
