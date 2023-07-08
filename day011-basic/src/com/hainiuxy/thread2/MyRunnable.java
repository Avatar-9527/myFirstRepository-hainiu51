package com.hainiuxy.thread2;

import java.util.Random;

public class MyRunnable implements Runnable {


    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"hello"+i);

//            if(i==10){
//                Thread.currentThread().setDaemon(true);
//
//            }
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }
    }
}
