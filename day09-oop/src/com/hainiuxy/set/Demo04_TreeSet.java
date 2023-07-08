package com.hainiuxy.set;

import java.util.TreeSet;

public class Demo04_TreeSet {
    public static void main(String[] args) {
        //创建集合

        TreeSet<Teacher> set = new TreeSet<>();
        Teacher t1 = new Teacher("Tom",18);
        Teacher t2 = new Teacher("Lily", 21);
        Teacher t3 = new Teacher("John", 22);
        Teacher t4 = new Teacher("Lucy", 21);
        Teacher t5 = new Teacher("Jerry", 25);
        Teacher t6 = new Teacher("Jerry", 25);

        //添加元素
        set.add(t1);
        set.add(t2);
        set.add(t3);
        set.add(t4);
        set.add(t5);
        set.add(t6);


        //查询
        for (Teacher t : set){
            System.out.println(t);

        }


    }
}
