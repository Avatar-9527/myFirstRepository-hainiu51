package com.hainiuxy.generic;

import java.util.ArrayList;
import java.util.Collections;

public class Demo03 {
    public static void main(String[] args) {

        //泛型方法  明确数据类型  调用方法明确
        test("sasa");
        test(100);
        test(new Object());

        System.out.println("----------------------");

        //Collection 方法： <T> T[] toArray(T[] a) --集合转成指定类型的数组
        //创建一个ArrayList<String> 类型的对象 arrayList
        ArrayList<String> arrayList =new ArrayList<>();
        //使用Collections.addAll()方法 向arrayList中添加元素
        Collections.addAll(arrayList,"adad","aa","1321");
        //获取元素数量 并创建一个大小为该数量的String类型的数组
        String[] arr = new String[arrayList.size()];

        //将集合中的元素  添加到参数数组中
        arrayList.toArray(arr);

        for (String s:arr) {
            System.out.println(s);

        }

    }

    public static <T > void test(T t){
        System.out.println(t);
    }

}
