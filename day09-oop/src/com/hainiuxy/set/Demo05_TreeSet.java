package com.hainiuxy.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo05_TreeSet {
    public static void main(String[] args) {

        //根据比较器进行排序
        //创建集合  传递一个比较器作为参数

        //匿名内部类
        TreeSet<Teacher> set = new TreeSet<>(new Comparator<Teacher>() {
            //o1  要存入的元素  o2已经存在的元素
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int num = o1.getAge() - o2.getAge();
                if(num==0){

                    num = o1.getName().compareTo(o2.getName());
                }
                return num;

            }
        });

        //创建集合时，传递一个比较器作为参数

        //Comparator 接口中  int compare(T o1, T o2);
        //比较器顺序


//        //lambda
//        TreeSet<Teacher> set = new TreeSet<>((o1,o2)->{
//            int num = o1.getAge() - o2.getAge();
//            if(num==0){
//
//                num = o1.getName().compareTo(o2.getName());
//            }
//            return num;
//        });



        Teacher t1 = new Teacher("Tom", 20);
        Teacher t2 = new Teacher("Lily", 21);
        Teacher t3 = new Teacher("John", 22);
        Teacher t4 = new Teacher("Lucy", 21);
        Teacher t5 = new Teacher("Jerry", 25);
        Teacher t6 = new Teacher("Jerry", 25);
        // 添加元素
        set.add(t1);
        set.add(t2);
        set.add(t3);
        set.add(t4);
        set.add(t5);
        set.add(t6);

        // 查询
        for (Teacher t : set) {
            System.out.println(t);
        }

    }
}
