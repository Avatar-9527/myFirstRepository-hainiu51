package com.hainiuxy.regex;

public class Demo02 {
    public static void main(String[] args) {

        /*String类中的API：
        public boolean matches(String regex)
        判断此字符串是否与给定的正则表达式匹配*/

//        String类中的API：
//        public String replaceAll(String regex, String replacement)
//        将此字符串中匹配给定正则表达式的所有子串替换
//        参数1表示正则表达式，符合此规则的子串将被替换
//                参数2表示要要替换每个匹配项的字符串
        String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";

//                String regex = "1[3|5-9]\\d{9}";
//
//                String s = str.replaceAll(regex,"**");
////                String s = str.replaceAll(regex, "****");
//
//                System.out.println(s);


        String word = "你T M     D真是人才，别TMD送了";
        String s1 = word.replaceAll("T\\s*M\\s*D","aaa");
        System.out.println(s1);

//        public String replaceFirst(String regex, String replacement)
//        将此字符串中匹配给定正则表达式的第一个子串替换

        String regex = "^[a-z0-9A-Z]+[-|a-z0-9A-Z._]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$";
// 下面四个邮箱都是符合规则的有效数据
        String email1 = "xxxyyy@zzz.com.cn";
        String email2 = "xxx-yyy@zzz.com";
        String email3 = "xxx_yyy@zzz";
        String email4 = "88888qq.com";
        System.out.println(email1.matches(regex));


    }
}
