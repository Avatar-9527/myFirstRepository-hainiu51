package com.hainiuxy.io;

import java.io.*;

public class Demo05_Buffer {
    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new FileReader("day011-basic\\\\b.txt"));
//        //读一行数据  一换行符结束  到达文件末尾  返回null
//        String line;
//        while((line = reader.readLine())!=null){
//
//            System.out.println(line);
//        }
//
//        reader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("day011-basic\\b.txt"));
        bufferedWriter.write("adadad");
        bufferedWriter.newLine();//根据平台写出一个换行符
        bufferedWriter.write("中午");
        bufferedWriter.newLine();

        bufferedWriter.close();


    }
}
