package com.hainiuxy.set;

import java.util.TreeSet;

public class Demo03_TreeSet {
    public static void main(String[] args) {
        //保证元素的唯一  要对元素排序  字符串的自然排序

        //和HashSet同样的操作
        TreeSet<String> set = new TreeSet<>();
        set.add("hello");
        set.add("world");
        set.add("hello");
        set.add("java");
        set.add("javaee");
        set.add("javaef");
        set.add("hello");

        for (String s:set) {
            System.out.println(s);

        }
    }
}
