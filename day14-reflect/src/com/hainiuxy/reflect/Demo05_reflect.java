package com.hainiuxy.reflect;

import java.lang.reflect.Method;

/*

反射获取成员方法并使用
 */
public class Demo05_reflect {
    public static void main(String[] args) throws Exception {

        //获取Class对象
        Class<Student> clazz =(Class<Student>) Class.forName("com.hainiuxy.reflect.Student");

        //获取构造器创建对象
        Student student = clazz.getDeclaredConstructor().newInstance();

        //获取所有公共方法
//        Method[] methods =clazz.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }

        //show
        Method m1 = clazz.getMethod("show");
        Object o1 = m1.invoke(student);
        System.out.println(o1);
        System.out.println("-----------------");

        //print(String str)

        Method m2 = clazz.getMethod("print", String.class);
        Object o2 = m2.invoke(student, "hello");
        System.out.println(o2);

        System.out.println("---------------");

        //int add(int a,int b)

        Method m3 = clazz.getMethod("add",int.class,int.class);
        Object o3 = m3.invoke(student, 3, 3);
        System.out.println(o3);
    }
}
