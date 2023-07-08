package com.hainiuxy.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
能否用字符流读写完成copy

copy 文本文件没问题

但是  copy 例如.jpg文件会出错
拷贝是字节流的事情
 *
 * 字符流是为了读文本不乱码  或者 写文本不乱码

 */
public class Demo04_ErrorCopy {
    public static void main(String[] args) throws IOException {

        FileReader filereader = new FileReader("day011-basic\\\\b.txt");
        FileWriter filewriter = new FileWriter("day011-basic\\\\c.txt");

        //缓冲区
        char[] c = new char[1024];
        int len;
        while((len= filereader.read(c))!=-1){

            filewriter.write(c,0,len);
        }

        filereader.close();
        filewriter.close();

    }
}
