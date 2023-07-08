package com.hainiuxy.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Demo04_TreeMap {
    public static void main(String[] args) {
        //创建对象   匿名内部类
        /**
         *  + **TreeMap底层是红黑树结构**
         * + 依赖**自然排序或者比较器排序，对键进行排序**
         * + **如果键存储的是自定义对象，需要实现Comparable接口
         * 或者在创建TreeMap对象时候给出比较器排序规则**
         */

        TreeMap<Student,String> map =new TreeMap<>(new Comparator<Student>() {
        @Override
            public int compare(Student s1,Student s2){
            //姓名长度
            int num = s1.getName().length()-s2.getName().length();
            if(num==0){
                //比较年龄
                num = s1.getAge()-s2.getAge();
            }
            if(num==0){
                num = s1.getName().compareTo(s2.getName());
            }
            return num;
        }
        });

        map.put(new Student("Tom", 20), "北京");
        map.put(new Student("Jerry", 21), "上海");
        map.put(new Student("Jack", 22), "天津");
        map.put(new Student("Jack", 20), "广州");
        map.put(new Student("Jack", 20), "重庆");

        map.forEach((k,v)->{
            System.out.println(k + "=" + v);
        });

    }
}
