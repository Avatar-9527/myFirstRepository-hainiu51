package com.hainiuxy.thread6;

import java.util.LinkedList;

/*
生产者线程   负责生产产品
 */
public class ProducerThread implements Runnable {

    //通过构造方法接收  容器
    private LinkedList<String> list;


    //接收队列  生产者线程生产产品  放入该队列
    public ProducerThread(LinkedList<String> list){

        this.list=list;
    }


    @Override
    public void run(){
        //生产者线程负责 不断的生产

        while(true){
            //同步
            synchronized(list){
                //如果有产品  那么生产者线程等待
                if(list.size()>0){

                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

                //现在没有产品  生产者线程执行  存入一个元素
                String product = "aaa";
                list.add(product);
                System.out.println(Thread.currentThread().getName()+"生产者生产了一个"+product+",目前剩余产品数量："+list.size());

                //唤醒等待的消费者  去消费

                list.notifyAll();
            }

        }




    }





}
