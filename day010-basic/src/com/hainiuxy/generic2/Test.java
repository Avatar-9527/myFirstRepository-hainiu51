package com.hainiuxy.generic2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //Collection接口  批量添加参数集合中的所有元素
        // E 是调用方法的集合的参数类型
        //? extends E  是参数 集合的数据类型
        //boolean addAll(Collection<? extends E> c)

        ArrayList<Fu> arrayListFu = new ArrayList<>();
        arrayListFu.add(new Fu());

        ArrayList<Zi> arrayListZi = new ArrayList<>();
        arrayListZi.add(new Zi());

        //多态
        arrayListFu.addAll(arrayListZi);
        System.out.println(arrayListFu);
    }
}
