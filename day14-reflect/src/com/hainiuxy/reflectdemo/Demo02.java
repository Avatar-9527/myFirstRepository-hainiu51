package com.hainiuxy.reflectdemo;

/*
请在泛型声明为String 的List集合中  添加一个Integer数据
越过泛型的编译期检查

 */

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();

        list.add("100");
//        list.add(000);   编译器  会检查

        //泛型擦除 ：泛型 是编译器的安全检测机制，防止不匹配的数据类型出现
        //在运行期间  JVM会对泛型擦除  把数据当成Object类型处理  获取元素时 会自动向下转型

        //反射获取ArrayList类的add方法  获取时  将参数设置为Object类型

        Class<ArrayList> aClass = (Class<ArrayList>)list.getClass();

        Method methodes = aClass.getMethod("add", Object.class);

        methodes.invoke(list,"aaa");
        methodes.invoke(list,100);
        methodes.invoke(list,new Object());

        for(Object o:list){
            System.out.println(o);
        }


    }
}
