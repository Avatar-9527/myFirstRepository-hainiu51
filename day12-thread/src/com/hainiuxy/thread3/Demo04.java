package com.hainiuxy.thread3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
    1、在模块下创建了文件夹 resources ，右键选中，Mark Directory as -- Resources Root
 * 2、在这个资源文件夹下面 创建了一个配置文件 以.properties 作为后缀的文件
 * 3、在配置文件中添加配置信息

 4. 读取配置文件
        Properties 可以从流中加载数据到集合中


 5.写入配置文件




 */
public class Demo04 {
    public static void main(String[] args) throws IOException {

//        load();

        store();
    }

    //保存到流中
    public static void store() throws IOException {
        Properties properties =new Properties();
        properties.setProperty("name","Tom");
        properties.setProperty("age", "23");
        properties.setProperty("address", "beijing");
        properties.setProperty("tel1", "12345678");
        properties.setProperty("tel5", "12345678");
        properties.setProperty("tel1", "12345678");
        properties.setProperty("tel5", "12345678");

        //写到流中

        FileOutputStream out = new FileOutputStream("day12-thread\\resources\\test.properties");


        //注释信息的中文  会以unicode编码方式展示

        properties.store(out,"this is tom's massage");

        out.close();




    }



    //从流中加载

    public static void load() throws IOException {
        Properties properties =new Properties();

        FileInputStream inputStream = new FileInputStream("day12-thread\\resources\\test.properties");

        properties.load(inputStream);
        properties.forEach((k,v)->{
            System.out.println(k+"="+v);
        });

        inputStream.close();


    }


}
