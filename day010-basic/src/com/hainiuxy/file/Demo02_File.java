package com.hainiuxy.file;

import java.io.File;
import java.io.IOException;

/*
绝对路径和相对路径
 *
 * 针对目前的java项目
 * 相对路径相对项目的根路径而言

 */
public class Demo02_File {
    public static void main(String[] args) throws IOException {
            //创建文件的方法  文件如果不存在则创建成功，文件所在的路径必须存在
        File file = new File("day010-basic/b.txt");
        System.out.println(file.createNewFile());

        //创建文件夹
        File file1 = new File("day010-basic/a");
        System.out.println(file1.mkdirs());

        //不要以是否有后缀名来区分是文件还是文件夹
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println(file1.exists());
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        // public boolean delete()  文件夹为空才可以删除；
        // java删除不走回收站

        System.out.println("-------------------------");
        System.out.println(file.delete());

        System.out.println(file1.delete());
        File file2 = new File("day010-basic/aa");
        System.out.println(file2.createNewFile());
        System.out.println(file2.delete());

    }
}
