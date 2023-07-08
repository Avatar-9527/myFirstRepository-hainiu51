package com.hainiuxy.oop3;

public class StudentTest {

    public static void main(String[] args) {
        //创建对象  通过无参构造方法
        Student st1 = new Student();
        st1.setName("张三");
        st1.setAge(55);
        System.out.println(st1.getName());
        System.out.println(st1.getAge());

        //创建对象  通过有参构造方法
        Student st2 = new Student("李华",56);
//        st2.show();
        st2.setName("李华2");
//        System.out.println(st2.getName());
//        st2.setAge(20);
//
//        System.out.println(st2.getAge());

        //调用成员方法
        st2.show();
//        System.out.println(st2.getName()+st2.getAge());



    }

}
