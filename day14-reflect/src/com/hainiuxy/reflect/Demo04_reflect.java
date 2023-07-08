package com.hainiuxy.reflect;

/*

  反射获取成员变量 并使用
 */

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Demo04_reflect {
    public static void main(String[] args) throws Exception {

        //获取Class 对象
        Class<Student> clazz=(Class<Student>) Class.forName("com.hainiuxy.reflect.Student");

        //获取构造方法并创建对象

        Student student =clazz.getDeclaredConstructor().newInstance();
        //获取成员变量
        Field[] fields =clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        //根据名称  获取  声明的字段中的一个
        Field f1 = clazz.getDeclaredField("name");
        System.out.println(f1);

        //取消访问 权限检查

        f1.setAccessible(true);

        //赋值 stu.setName("Tom")  成员变量对象.set(成员变量所属对象, 成员变量的值)

        f1.set(student,"Tom");

        //获取值  stu.getName()
//        String name = f1.getName();
//        System.out.println(name);
        Object value = f1.get(student);
        System.out.println(value);
        System.out.println("-----------------");

        Field f2 =clazz.getDeclaredField("age");
        f2.setAccessible(true);
        f2.set(student,20);
        Object v2 =f2.get(student);

        System.out.println(v2);
        System.out.println(student);


    }
}
