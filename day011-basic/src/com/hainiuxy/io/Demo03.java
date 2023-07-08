package com.hainiuxy.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
字符流不适合用于文件拷贝
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {

            //读
//        //FileReader是Java中用于读取字符流的类，可以一次读取一个字符或一个字符数组。
//        FileReader reader = new FileReader("day011-basic\\a.txt");
//
//        //一次读一个字节
//        int ch ;
//        while((ch=reader.read())!=-1){
//            System.out.print((char)ch);
//        }
//
//        System.out.println();
//        reader.close();

        //写

        FileWriter writer = new FileWriter("day011-basic\\\\b.txt");

        writer.write("adadad");
        writer.write("111\n");
        writer.write("222222");


        //释放资源
        writer.flush();
        writer.close();



    }
}
