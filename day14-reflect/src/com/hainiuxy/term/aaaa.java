package com.hainiuxy.term;

import java.util.LinkedList;

public class aaaa {
    private static LinkedList<String> list = new LinkedList<>();


    static {
        list.add("及时雨宋江");
        list.add("玉麒麟卢俊义");
        list.add("智多星吴用");
        list.add("入云龙公孙胜");
        list.add("大刀关胜");
        list.add("豹子头林冲");
        list.add("霹雳火秦明");
        list.add("双鞭呼延灼");
        list.add("小李广花荣");
        list.add("小旋风柴进");
        list.add("扑天雕李应");
        list.add("美髯公朱仝");
        list.add("花和尚鲁智深");
        list.add("行者武松");
    }
    public static void main(String[] args) {


     new Thread(()->{

         while (true){
             //加锁
             synchronized (list){
                 if(list.isEmpty()){
                     break;

                 }
                 System.out.println(Thread.currentThread().getName()+"获得英雄:"+list.removeFirst());

                 //
                 try {
                     Thread.sleep(100);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }

             }
         }



     }).start();


        Thread threadA = new Thread("线程A");
        Thread threadB = new Thread("线程B");
        Thread threadC = new Thread("线程C");



    }
}
