package com.hainiuxy.thread1;


//自定义一个类 Mythread  继承Thread类
public class MyThread extends Thread {

    //重写run()方法  执行任务在这个方法
    @Override
    public void run(){

        for (int i = 0; i < 100; i++) {
            if (getName().equals("张三")&& i==10){
//                yield();

                try {
                    join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
            System.out.println(getName()+"hello"+i);


        }

    }
}
