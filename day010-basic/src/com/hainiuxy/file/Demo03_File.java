package com.hainiuxy.file;
/*
| 方法名                          | 说明                                                   |
 * | ------------------------------- | ------------------------------------------------------ |
 * | public String getAbsolutePath() | 返回此抽象路径名的绝对路径名字符串                     |
 * | public String getPath()         | 将此抽象路径名转换为路径名字符串                       |
 * | public String getName()         | 返回由此抽象路径名表示的文件或目录的名称               |
 * | public File[] listFiles()       | 返回此抽象路径名表示的目录中的文件和目录的File对象数组 |
 *
 */

import java.io.File;

public class Demo03_File {
    public static void main(String[] args) {
        File file1 = new File("E:\\IdeaProjects\\javase-study51\\day010-basic\\aaa.txt");
        System.out.println(file1.exists());

        String absolutePath = file1.getAbsolutePath();
        System.out.println(absolutePath);

        //getPath  获取路径
        String path = file1.getPath();
        System.out.println(path);

        String name = file1.getName();
        System.out.println(name);
        //获取文件的大小
        System.out.println("--------------------");
        File fil2 = new File("C:\\Users\\50892\\Desktop");
        long length = fil2.length();
        System.out.println(length);

        //获取文件列表
        File[] files = fil2.listFiles();
        for (File file:files) {
            System.out.println(file);
        }
    }
}
