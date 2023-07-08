package com.hainiuxy.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //创建输入流指向文件
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\50892\\Desktop\\集合.pdf");
        //创建输出流指向目标文件
        FileOutputStream fileOutputStream = new FileOutputStream("day010-basic\\src\\com\\hainiuxy\\集合.pdf");
        //读写操作

        //一次写一个字节
//        int by;
//        while((by=fileInputStream.read())!=-1){
//            fileOutputStream.write(by);
//        }

        //一次写一个字节数组

        //加入缓冲区  提高效率
        byte[] bytes = new byte[8000];
        int len;
        while((len=fileInputStream.read())!=-1){
            fileOutputStream.write(bytes,0,len);
        }

        //释放资源
        fileInputStream.close();
        fileOutputStream.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}
