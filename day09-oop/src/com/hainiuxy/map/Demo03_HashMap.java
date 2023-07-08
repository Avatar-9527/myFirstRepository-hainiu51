package com.hainiuxy.map;

import java.util.HashMap;

public class Demo03_HashMap {
    public static void main(String[] args) {
        //HashMap 把对象作为参数
        HashMap<Student,String> hashMap =new HashMap<>();
        hashMap.put(new Student("Tom",20),"北京");
        hashMap.put(new Student("Jerry", 21),"");
        hashMap.put(new Student("Jack", 22),"");
        hashMap.put(new Student("Jack", 20),"");
        hashMap.put(new Student("Jack", 20),"");

        hashMap.forEach((k,v)->{
            System.out.println(k + "=" + v);
        });

    }
}
