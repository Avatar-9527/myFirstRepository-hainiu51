package com.hainiuxy.regex;

import jdk.nashorn.internal.ir.CallNode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo05 {
    public static void main(String[] args) {

        //Pattern p = Pattern.compile("a*b"); // 将字符串形式的正则表达式编译为Pattern类的实例
        //Matcher m = p.matcher("aaaaab"); // 创建一个匹配此模式的给定输入的匹配器
        //boolean b = m.matches(); // 判断输入的字符串是否匹配此模式

        //将正则表达式编译  获取Pattern 对象
//        Pattern pattern = Pattern.compile("a*b");

        //获取解析和匹配字符串的匹配器
//        Matcher matcher = pattern.matcher("aabc");
//
//        boolean matches = matcher.matches();
//        System.out.println(matches);

        //public boolean matches()
        //   	尝试将整个字符串与模式匹配
        //
        //public boolean find()
        //    尝试查找与模式匹配的输入序列的下一个子序列
        //public String group()
        //    返回上一个匹配项匹配的输入子序列

//        System.out.println(matcher.find());
//        String s = matcher.group();
//        System.out.println(s);


        String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";

        //Pattern

        Pattern pattern = Pattern.compile("1[3|5-9]\\d{9}");
        Matcher matcher = pattern.matcher(str);

        //循环查找
        while(matcher.find()){
            //获取
            String s = matcher.group();
            System.out.println(s);
        }


    }
}
