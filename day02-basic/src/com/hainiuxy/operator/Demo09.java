package com.hainiuxy.operator;


import java.util.Random;
import java.util.Scanner;
public class Demo09 {

    public static void main(String[] args) {

//        //键盘输入
//        Scanner sc = new Scanner(System.in);
//        //输入三个学生身高
//        System.out.println("请输入第一个学生的身高: ");
//        int a = sc.nextInt();
//
//        System.out.println("请输入第一个学生的身高: ");
//        int b = sc.nextInt();
//
//        System.out.println("请输入第一个学生的身高: ");
//        int c = sc.nextInt();
//
//        //三元运算符 求出最大身高
//        int high = a > b ? a : b;
//        int max = high > c ? high : c;
//        System.out.println("最高的学生身高为：" + max);



        Random r = new Random();
        int random = r.nextInt(2);
        System.out.println(random);




    }

}
