package com.hainiuxy.api2;


import java.util.Scanner;

/**
 * 回文游戏   键盘输入一段文字 判断是否是回文  对称字符串
 *   上海自来水来自海上
 */
public class Demo02_StringBuiler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段文字：");
        String str = sc.nextLine();

        System.out.println(str.equals(new StringBuilder(str).reverse().toString()));


        //转换成StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);

        //反转
        stringBuilder.reverse();
        //输出字符串
        String s = stringBuilder.toString();
        if(str.equals(s)){
            System.out.println("是回文");

        }else{
            System.out.println("不是回文");
        }


    }
}
