package com.hainiuxy.io;


import java.io.File;
import java.util.Objects;

/*
统计文件夹的大小
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(getLength(new File("C:\\Users\\50892\\Desktop")));

    }
    public static long getLength(File dir){
        //如果不存在
        if(!dir.exists()){
            return 0;
        }

        //如果是文件
        if(dir.isFile()){
            return dir.length();
        }

        //是文件夹
        File[] files = dir.listFiles();
        long length = 0L;
        //判断一个对象是否为null
        if(Objects.nonNull(files)){
            for(File file:files){
                //如果还是文件
                if(file.isFile()){
                    //累加文件大小
                    length += file.length();

                }else{
                    //如果是文件夹  则递归    累加这个子文件夹的大小
                    length +=getLength(file);

                }

            }

        }

        return length;


    }



}
