package com.hainiuxy.regex;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //判断用户输入手机号是否正确

        Scanner sc = new Scanner(System.in);




        //判断   正则表达式  第一位是1  第二位是3或者5-9
        String regex = "1[3|5-9]\\d{9}";
        //输出  限制5次
        for(int i=0;i<6;i++){
            System.out.println("请输入手机号");
            String phoneNumber = sc.nextLine();

            //字符串匹配
            boolean matches = phoneNumber.matches(regex);
            System.out.println(matches);
        }



    }
}
