package com.hainiuxy.api;



//    模拟用户的登录动作
// *
//         * 验证码 验证一般不区分大小写

import java.util.Scanner;

public class Demo05_String {

    public static void main(String[] args) {
        // public int compareTo(String anotherString)
//        按字典顺序比较两个字符串。
//        按照两个字符串相同索引上第一个不同的字符的char值进行比较，返回this.charAt(k)-anotherString.charAt(k)
//        如果相同索引上的字符全部相同，则较短的字符串按字典顺序位于较长的字符串之前，即返回this.length()-anotherString.length()
//        如果两个字符串完全相等，返回0
        String s1 = "abc";
        String s2 = "aba";

        int i = s1.compareTo(s2);
        System.out.println(i);

//        public int compareToIgnoreCase(String str)
//        按字典顺序比较两个字符串，但是忽略大小写。

        int c= s1.compareToIgnoreCase(s2);
        System.out.println(c);

        //定义变量存储已经注册的用户名和密码

        String usename = "admin";
        String password = "123456";

        // 输入用户名和密码 比较
        // 循环 5次机会 冻结

        Scanner sc = new Scanner(System.in);

//        for(int i=0;i<5;i++){
//            System.out.println("请输入用户名：");
//            String name = sc.nextLine();
//            System.out.println("请输入密码：");
//            String word = sc.nextLine();
//
//            //比较
//            if(usename.equals(name) &&password.equals(word)){
//                System.out.println("登录成功"+usename);
//                //登录成功  跳出循环
//                break;
//
//
//            }else{
//                System.out.println("用户名或密码有误,还有"+(4-i)+"次机会");
//            }
//
//
//
//        }


    }


}
