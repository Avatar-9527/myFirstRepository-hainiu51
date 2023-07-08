package com.hainiuxy.thread6;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        //创建一个容器  传递给两个线程类  保证他们使用同一个容器

        LinkedList<String> list = new LinkedList<>();
        new Thread(new ProducerThread(list)).start();
        new Thread(new ConsumerThread(list)).start();


    }
}
