package com.hainiuxy.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo02_Collection {
    public static void main(String[] args) {
        //创建集合对象

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello world");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("hello");
        arrayList.add("hi");
        arrayList.add("haha");
        arrayList.add("heihei");


        //使用迭代器  Iterator<E>  iterator():返回此集合中元素的迭代器，
        // 通过集合的iterator()  方法得到

//        arrayList.iterator().var  这个方法的返回值
        Iterator<String> iterator = arrayList.iterator();

        //删除操作
        while(iterator.hasNext()){
            String s = iterator.next();
            if("java".equals(s)){
                //指向谁，就删除谁

                iterator.remove();
            }
        }
        System.out.println(arrayList);


        //用while 循环实现元素的判断和获取
        //boolean hasNext();  -- 判断是否有下一个元素

        //E next(); -- 获取下一个元素  通过迭代器
        while (iterator.hasNext()){
            String s = iterator.next();
            //一次判断只能获取一次  next方法获取元素会自动指向下一个元素
            //等于 获取下下一个  next next
//            String s2 = iterator.next();
            System.out.println(s);

        }

        System.out.println("------------------------");

        //数据类型一定是一个集合或者书序中元素的类型
        //str 仅仅是一个变量名   在循环过程中 ，依次表示集合或者数组中的每一个元素
        //arrayList 就是要遍历的集合或者数组
        for (String s:arrayList) {
            //直接使用s
            System.out.println(s);

        }

        System.out.println("---------------------");
        int[] arr = new int[]{1,2,3,4,5};

        //此时  i不代表索引   代表数组中的元素
        for(int i:arr){
            System.out.println(i);
        }

        //实现Iterator 接口类  能够称为 for-each 语句的目标





    }
}
