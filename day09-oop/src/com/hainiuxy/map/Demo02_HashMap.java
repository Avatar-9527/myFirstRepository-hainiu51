package com.hainiuxy.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02_HashMap {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String,String> hashMap = new HashMap<>();
        //添加  修改
        //当键不存在时  添加元素 返回null
        //当键存在时   将值覆盖  将被覆盖的元素返回
        hashMap.put("aa", "aa");
        hashMap.put("杨过", "郭襄");
        hashMap.put("张无忌", "赵敏");
        hashMap.put("杨过", "小龙女");


        //通过键找值
        //获取所有的键   keySet 获取所有键的集合
        Set<String> strings = hashMap.keySet();
        //遍历集合得到每一个键
        for(String key:strings){
            //通过键获得值
            String s = hashMap.get(key);
            System.out.println("key:"+key+" value:"+ s);

        }
        System.out.println("-------------------");

        //获取所有的键值对映射关系
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        //遍历得到每一个键值对映射关系

        for(Map.Entry<String,String> entry:entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key"+key+" value"+value);
        }

        System.out.println("-----------------------");

    }
}
