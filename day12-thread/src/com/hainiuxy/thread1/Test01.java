package com.hainiuxy.thread1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/*

 BlockingQueue 阻塞队列
 */
public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        //等待唤醒机制

        //ArrayBlockingQueue  有界队列
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);
        //在队列的尾部 添加元素  阻塞式的  当队列已满时  等待队列可用
        queue.put("hello1");
        queue.put("hello2");
        queue.put("hello3");
//        queue.put("hello4");

        //取出队列头部的元素  阻塞式的  当队列为空时  等待

//        String take = queue.take();
//        System.out.println(take);
//        System.out.println(queue);

        for(int i=0;i<4;i++){

            String s = queue.take();
            System.out.println(s);
        }
        queue.put("hello4");
//        System.out.println(queue);


        //阻塞队列   ArrayBlockingQueue   LinkedBlockingQueue

        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<String>(1);
        //生产
        new Thread(()->{
            int x =1;
            while(true){
                try {
                    arrayBlockingQueue.put("aaa"+ x++);
                    System.out.println("生产了一个产品  目前队列中产品剩余个数："+arrayBlockingQueue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();


        //消费
        new Thread(()->{

            while(true){
                String s = null;
                try {
                    s = arrayBlockingQueue.take();
                    System.out.println("生产了一个产品  目前队列中产品剩余个数："+arrayBlockingQueue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("消费了一个产品"+s+"目前剩余"+arrayBlockingQueue.size());
            }
        }).start();

        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();



    }
}
