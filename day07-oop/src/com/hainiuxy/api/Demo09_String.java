package com.hainiuxy.api;

import java.util.Arrays;

public class Demo09_String {
    public static void main(String[] args) {
        //public byte[] getBytes()
        //	使用平台的默认字符集将字符串编码为一系列字节，
        //	将结果存储到新的字节数组中。
        //一个中文字符占三个字节
        String s= "abc中";
        byte[] b = s.getBytes();
        System.out.println(Arrays.toString(b));
        String s1 ="bbb";
        System.out.println(s1);

        char[] c1 = s1.toCharArray();
//        for (int i=0;i<c1.length;i++) {
//            System.out.println(c1[i]);
//        }
        System.out.println(Arrays.toString(c1));
//        System.out.println(c1);


        String c = s1.trim();
        System.out.println(c);

        //任意数据 转换为字符串
        String s3 = String.valueOf(new Object());
        System.out.println(s3);

        //public static String valueOf(Object obj)
        //    返回Object参数的字符串表示形式。
        //    // valueOf方法有多个，形成重载，可以接收任意类型参数。
        //    如果是引用数据类型，
        //    其返回的字符串为该对象的toString()方法的返回值。

        int num =10;
        System.out.println(""+num);
        String s2 = String.valueOf(num);
        System.out.println(s2);


    }
}
