package com.hainiuxy.file;
/*
 * | File(String pathname)             | 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例 |
 * | File(String parent, String child) | 从父路径名字符串和子路径名字符串创建新的   File实例         |
 * | File(File parent, String child)   | 从父抽象路径名和子路径名字符串创建新的   File实例           |
 */


import java.io.File;

public class Demo01_File {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\50892\\Desktop\\d.txt");
        System.out.println(file);

        File file1 = new File("d:/a.txt");
        System.out.println(file1);



    }
}
