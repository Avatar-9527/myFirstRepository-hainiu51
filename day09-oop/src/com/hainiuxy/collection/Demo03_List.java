package com.hainiuxy.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo03_List {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello world");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("hello");
        arrayList.add("hi");
        arrayList.add("haha");
        arrayList.add("heihei");
        System.out.println(arrayList.get(3));

        System.out.println("---------------------------");
        //传入  arrayList 作为参数
        ArrayList<String> arrayList1 = new ArrayList<>(arrayList);
        System.out.println(arrayList1);

        //从索引1  开始插入
        arrayList.add(1,"1111");
        System.out.println(arrayList);

        String remove = arrayList.remove(2);
        System.out.println(remove);

        //获取初始  未操作时的数组中的元素
        System.out.println(arrayList.get(3));

        System.out.println("------------------");
        //
        for(int i=0;i<arrayList.size();i++){
            String s = arrayList.get(i);
            System.out.println(s);

        }
        System.out.println("---------------------");

        for (String s:arrayList ) {
            System.out.println(s);
        }

        System.out.println("---------------------");

        //集合对象提供的forEach 方法  ，方法的参数是一个函数式接口
        //该方法已经获取到集合中的每个元素
        //将这些元素传递给了Consumer  接口的accept 方法
        //而accept方法  需要我们实现
        //lambda 表达式
        arrayList.forEach((s)-> System.out.println(s));
    }
}
