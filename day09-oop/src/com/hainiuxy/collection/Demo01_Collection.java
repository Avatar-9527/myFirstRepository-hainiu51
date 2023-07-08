package com.hainiuxy.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//添加元素
//boolean add(E e)
//
//// 删除所有元素 清空
//void clear()
//
//// 删除指定的元素 -- 根据equals比较进行匹配，只删除第一个匹配
//boolean remove(Object o)
//
//// 根据条件删除元素 -- 符合条件的全部删除
//default boolean removeIf(Predicate<? super E> filter)
//
//// 判断是否包含指定的元素
//boolean contains(Object o)
//
//// 判断集合是否为空（即集合长度为0）
//boolean isEmpty()
//
//// 获取集合的长度（即元素的个数）
//int size()
//
//// 将集合转换为Obejct数组
//Object[] toArray()
//
//// 将集合转换为指定数据类型的数组
//<T> T[] toArray(T[] a)
//
//// 获取此集合中元素的迭代器
//Iterator<E> iterator()

public class Demo01_Collection {
    public static void main(String[] args) {

        //        String s = new String("","");
        //        Collections collections = new Collections("abc","abc");
        //        Collections.addAll();
        //Collections 的实现类
        //使用一个引用数据类型   替代<>中的E  菱形运算符
        ArrayList<String> arrayList = new ArrayList<>();

        //数组添加
        arrayList.add("hello world");
        arrayList.add("hello world");
        arrayList.add("hello world");
        arrayList.add("hello world");
        arrayList.add("hello world");


//        arrayList.clear();
        arrayList.remove("hello");
        //传入lambda表达式  根据自己的条件删除
        //删除所有以d开头的
//        System.out.println(arrayList.toString());
//        arrayList.removeIf((t)->t.startsWith("he"));
        System.out.println(arrayList.contains("hello world"));
        System.out.println(arrayList.isEmpty());
        //数组的length属性  字符串的length()  集合的size()
        System.out.println(arrayList.size());


        //  将集合转换为Obejct数组
        //Object[] toArray()
        Object[] str = arrayList.toArray();

        for (int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }

        System.out.println("---------------------");
        System.out.println(arrayList);



    }
}
