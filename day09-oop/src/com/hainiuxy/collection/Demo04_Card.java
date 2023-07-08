package com.hainiuxy.collection;

import java.util.LinkedList;

/*
1-108 编号，卡片拿在手中，拿起一张扔掉，拿起一张放到下面，反复这个操作，
直到剩余一张，剩下谁？

LinkedList 可以进行 头尾操作

 */
public class Demo04_Card {
    public static void main(String[] args) {

//        LinkedList 的操作
//        LinkedList<String> linkedList = new LinkedList<>();
//
//        linkedList.add("aaa");
//        linkedList.add("bbb");
//        linkedList.add("ccc");
//
//        String first = linkedList.getFirst();
//        linkedList.getLast();
//        System.out.println(linkedList.getLast());
//        System.out.println(first);
//        System.out.println(linkedList);
//        System.out.println();

        //包装类
        LinkedList<Integer> linkedList = new LinkedList<>();

        //添加卡片
        for(int i=0;i<108;i++){
            linkedList.add(i);

        }
        System.out.println(linkedList);


        //判断
        while(linkedList.size()>1){
            //扔掉一张  删除头元素
            linkedList.removeFirst();
            //拿起一张放下面  把要删除头的元素 插入尾部
            linkedList.addLast((linkedList.removeFirst()));
        }
        //获取最后一张
        System.out.println(linkedList.getFirst());




    }
}
