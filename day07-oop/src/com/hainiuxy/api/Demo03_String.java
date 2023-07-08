package com.hainiuxy.api;

public class Demo03_String {
    public static void main(String[] args) {

        //new  出来的对象在堆中   直接复制的在方法区的常量池

        String s1 = new String();
        // 空？
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.hashCode());
        System.out.println("---------------------");
        //new  出来的是副本  重新开辟一块空间
        String s2 = new String("abc");
        System.out.println(s2);
        System.out.println(s2.length());

        System.out.println("----------------------");
        //引用
        String s3 = "abc";
        //不相等   重写开辟一块空间
        System.out.println(s2==s3);
        System.out.println("--------------------------");
//        将字节数组转换为字符串
// public String(byte[] bytes){
//
//        }
        byte[] bytes = new byte[]{97, 98, 99, 100, 101};
        String s4 = new String(bytes);
        System.out.println(s4);
// public String(byte[] bytes, int offset, int length) 将字节数组的一部分字节转换为字符串
        String s5 = new String(bytes,1,4);
        System.out.println(s5);


        // public String(char[] value) 将字符数组转换为字符串
        char[] chars = {'a','b','c','中','国'};
        String s6 = new String(chars);
        System.out.println(s6);

        // public String(char[] value, int offset, int count)
        String s7 = new String(chars,1,4);
        System.out.println(s7);
        //sout   自带toString()
        System.out.println(chars);
    }
}
