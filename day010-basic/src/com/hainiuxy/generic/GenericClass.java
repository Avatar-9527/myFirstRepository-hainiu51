package com.hainiuxy.generic;

public class GenericClass<T> {
    //在类中就把T类型当做Object 类型使用即可
    public void test(T t){
        String s = t.toString();
        System.out.println(s);
    }
}
