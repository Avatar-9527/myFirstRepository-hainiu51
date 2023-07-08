package com.hainiuxy.reflect;

public class Demo01_reflect {
    public static void main(String[] args) throws ClassNotFoundException {

        //只知道源文件

        // 只知道源文件
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiuxy.reflect.Student"); // 全限定类名
        System.out.println(clazz);

        //已经编译  任意数据类型.class  获取该类的字节码文件对象

        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);

        System.out.println(clazz==studentClass);
        System.out.println(clazz.equals(studentClass));

        //已经有对象了  Object类定义了方法  获取该对象的字节码文件对象
        Student student = new Student();
        Class<Student>  studentClass1 =(Class<Student>)student.getClass();
        System.out.println(studentClass1);

    }
}
