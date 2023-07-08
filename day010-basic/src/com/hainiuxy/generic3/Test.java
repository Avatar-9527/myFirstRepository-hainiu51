package com.hainiuxy.generic3;

import java.time.Period;
import java.util.Comparator;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        //map 集合 比较器  public TreeMap(Comparator<? super K> comparator)

        //集合中的键存储的是Student
        //提供排序规则  ：  对Student排序也可以  也可以对Person 类型排序  多态
        TreeMap<Student,String> map =  new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        map.put(new Student("Tom"),"aaa");
        map.put(new Student("Tony"), "dccc");
        map.put(new Student("Kevin"), "bnbb");

        map.forEach((k,v)->{
            System.out.println(k+"="+v);
        });

    }
}
