package com.hainiuxy.api;



import java.util.Scanner;

public class Demo04_String {

    public static void main(String[] args) {

        /**
        // 字符串遍历 -- 键盘录入一段文本，统计文本中有多少英文字母？
        // 键盘输入
        //  Scanner sc = new Scanner(System.in);

        /*System.out.println("请输入整数：");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("请输入一行数据");
        String s = sc.nextLine(); // 获取一行数据 以回车键结束
        System.out.println(s);*/
/*

        String str = "abc中国";
        //
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
*/


        // 字符串遍历 -- 键盘录入一段文本，统计文本中有多少英文字母？
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行数据：");
        String s = sc.nextLine();

        int count = 0;


//        //遍历字符串  统计
//        for(int i=0;i<s.length();i++){
//            char c = s.charAt(i);
//            if(c>='a' && c<='z' || c>='A' &&c<='Z'){
//                count++;
//
//            }
//
//        }
//        遍历字符串  统计
        for (int i = 0; i < s.length(); i++) {
            // 获取每个字符
            char c = s.charAt(i);
            boolean flag1 = c >= 'a' && c <= 'z';
            boolean flag2 = c >= 'A' && c <= 'Z';
            // 判断字符是英文
            if (flag1 || flag2) {
                count++;
            }
        }

        //输出
        System.out.println(count);



    }
}
