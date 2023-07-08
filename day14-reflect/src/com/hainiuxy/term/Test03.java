package com.hainiuxy.term;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Tom", "80",
                "Jerry", "85", "Jack", "82", "Rose",
                "90", "John", "88", "Tony", "77");


        //Map  键值对  key  value
        //定义一个集合   排序用 TreeMap
        TreeMap<String,Integer> map = new TreeMap<String, Integer>() ;
        //取元素放入 TreeMap中
        for(int i=0;i<list.size();i+=2){
            String key =list.get(i);
            Integer value = Integer.valueOf(list.get(i+1) );

            map.put(key,value);
//            System.out.println(key+"="+value);
        }

        System.out.println(map);

//        for (int i=0;i<list.size();i+=1){
//            map.put(list.get(i),)
//
//        }

//        //取出键值对
//        for (Map.Entry<String, Integer> Entry : map.entrySet()) {
//            System.out.println(Entry.getKey()+Entry.getValue());
////            System.out.println(stringIntegerEntry.getValue());
////
////            System.out.println(stringIntegerEntry);
//        }




    }
}
