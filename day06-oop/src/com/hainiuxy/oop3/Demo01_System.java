package com.hainiuxy.oop3;


/*
测试一段程序的执行时间  模板方法设计模式

先定义一个算法的骨架 ，而将这个算法中的一步或者多步，延迟到子类实现
先这样可以使得子类在不改变算法结构的基础上，重新定义算法的其中一步或多步，

开闭原则：对扩展开放   对修改关闭   ---维护性




*/

public class Demo01_System {
    public static void main(String[] args){
    //当前系统时间   距离 1970-1-1 0:0:0


//    //起始时间
//
//    long start = System.currentTimeMillis();
//    //执行代码
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Hello World");
//        }
//
//
//    //结束时间
//
//    long end = System.currentTimeMillis();
//
//    //取时间差  则为代码执行时间
//
//    System.out.println(end-start);


    RuntimeTemplateFor test = new RuntimeTemplateFor();
        System.out.println(test.getTime());


    RuntimeTemplateWhile test2 = new RuntimeTemplateWhile();
        System.out.println(test2.getTime());



    }



}
