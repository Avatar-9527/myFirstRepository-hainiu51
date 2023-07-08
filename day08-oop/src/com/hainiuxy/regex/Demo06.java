package com.hainiuxy.regex;

public class Demo06 {
    public static void main(String[] args) {

        // 现得到如下的字符串：
        String s = "我..我....我.我...我.要.要...要...要..要...要.学..学.学...学.学.编...编.编..编...编...程程..程..程";
        // 请还原出其中的有效信息：我要学编程

        //替换  把.  换位空串

        String s1 = s.replaceAll("\\.","");
        System.out.println(s1);

        //我我我我我要要要要要要学学学学学编编编编编程程程程
        //将任意字符放入组中，引用 这个组一次或多次
        String regex = "(.)\\1+";
        //第二个参数$n  中   形式去第一个参数的中的组
        String s2 = s1.replaceAll(regex,"$1");
        System.out.println(s2);
    }
}
