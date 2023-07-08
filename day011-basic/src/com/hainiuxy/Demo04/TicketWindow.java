package com.hainiuxy.Demo04;

import java.util.concurrent.locks.ReentrantLock;

public class TicketWindow implements Runnable {
    private static int ticket = 100;
    //可重入互斥锁  (空参构造   默认创建非公平锁)
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run(){


        //不停的售卖

        while(true){
            //获取锁
            lock.lock();

            //判断票是否卖完
            //出现0票
            try {
                if(ticket <=0){
                    break;
                }
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在售出第"+ticket--+"张票");
            } finally {
                lock.unlock();
            }


        }



    }
}
