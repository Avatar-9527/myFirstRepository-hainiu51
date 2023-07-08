package com.hainiuxy.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo02_ClassLoader {
    public static void main(String[] args) throws IOException {
        //获取系统类加载器  以流的形式获取系统资源  参数：由于资源放在了资源根目录  直接写资源文件的名称即可
        InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("info.properties");

        //Properties 从流中加载
        Properties properties = new Properties();
        properties.load(stream);

        //
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String email = properties.getProperty("email");

        System.out.println(username);
        System.out.println(password);
        System.out.println(email);


    }
}
