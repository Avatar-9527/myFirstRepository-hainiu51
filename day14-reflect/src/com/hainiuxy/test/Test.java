package com.hainiuxy.test;


/*

已知一个 HashMap<Integer，User>集合， User 有 name（String）和 age（int）属性。
请写一个方法实现对HashMap 的排序功能，该方法接收 HashMap<Integer，User>为形参，
返回类型为 HashMap<Integer，User>，
要求对 HashMap 中的 User 的 age 倒序进行排序。
排序时 key=value 键值对不得拆散。

 */

import java.util.*;

public class Test {
    public static void main(String[] args) {

        HashMap<Integer,User> userHashMap = new HashMap<>();
        userHashMap.put(1,new User("Tom",18));
        userHashMap.put(2, new User("Jerry", 21));
        userHashMap.put(3, new User("John", 23));
        userHashMap.put(4, new User("Jack", 20));
        userHashMap.put(5, new User("Rose", 24));
        userHashMap.put(6, new User("Lily", 25));
        userHashMap.put(7, new User("Lucy", 25));
//        System.out.println(userHashMap);

        HashMap<Integer, User> userHashMap1 = sortHashMap(userHashMap);
        userHashMap1.forEach((k,v)->{

            System.out.println(k+"="+v);
        });


    }
    //定义方法  按照用户的年龄倒序排序   返回的结果还是HashMap
    public static HashMap<Integer,User> sortHashMap(HashMap<Integer,User> userHashMap){
        //  将HashMap  中所有的Entry对象转换为List

        ArrayList<Map.Entry<Integer, User>> entries = new ArrayList<>(userHashMap.entrySet());

        //对List集合排序  采用比较器顺序

        Collections.sort(entries,(entry1,entry2)->
            entry2.getValue().getAge()-entry1.getValue().getAge()
        );

        //LinkedHashMap  是HashMap的子类  可以保证迭代顺序

        LinkedHashMap<Integer,User> linkedHashMap = new LinkedHashMap<>();

        //遍历排序好的List集合  将元素都存入 LinkedHashMap
//        entries.forEach(entry->linkedHashMap.put(entry.getKey(),entry.getValue()));

        for (Map.Entry<Integer, User> entry : entries) {
            linkedHashMap.put(entry.getKey(),entry.getValue());

        }

        return linkedHashMap;
    }


}
