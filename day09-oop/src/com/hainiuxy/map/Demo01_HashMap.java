package com.hainiuxy.map;



import java.util.HashMap;
import java.util.HashSet;

public class Demo01_HashMap {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String, String> hashMap =new HashMap<>();
        //添加  修改
        //当键不存在时  添加元素 返回null
        //当键存在时   将值覆盖  将被覆盖的元素返回
        System.out.println(hashMap.put("aa", "aa"));
        System.out.println(hashMap.put("杨过", "郭襄"));
        System.out.println(hashMap.put("张无忌", "赵敏"));
        System.out.println(hashMap.put("杨过", "小龙女"));
        System.out.println(hashMap);


    }
}
