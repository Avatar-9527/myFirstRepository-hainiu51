package com.hainiuxy.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo01_HashSet {
    public static void main(String[] args) {

        //创建hashset 集合对象
//        Set<String> set = new TreeSet<>();
//        set.add("hello");
//        set.add("hello1");
//        set.add("hello2");
//        Iterator<String> iterator = set.iterator();
//        for (String s :set ) {
//            System.out.println(s);
//
//        }
        //HashSet可以保证元素不重复

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("hello1");
        hashSet.add("hello2");
        hashSet.add("hello3");
        hashSet.add("hello4");
        hashSet.add("hello4");
        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);

        }
        System.out.println("--------------------");

        //此时  s代表集合中的元素  forEach 是方法 不是  fori的增强for
        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println(hashSet);
    }
}
