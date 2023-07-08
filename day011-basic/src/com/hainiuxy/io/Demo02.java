package com.hainiuxy.io;

/*
文件的拷贝

 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public class Demo02 {
    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:\\Users\\50892\\Desktop\\集合.pdf");
            out = new FileOutputStream("C:\\Users\\50892\\Desktop\\集合01.pdf");

            //定义一个缓冲区数组

            byte[] bytes = new byte[1024];
            int len;
            //读
            while((len =in.read(bytes))!=-1){
                //写
                out.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭  输入流对象不为空
            if (Objects.nonNull(in)){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(Objects.nonNull(out)){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }

    }
}
