package com.hainiu.jdbc1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Demo02 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {


        // 读取 配置 文件中 的信息

        InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");

        Properties properties = new Properties();

        properties.load(stream);
        //建立连接
        String driver = properties.getProperty("jdbc.driver");
        String url = properties.getProperty("jdbc.url");
        String username = properties.getProperty("jdbc.name");
        String password= properties.getProperty("jdbc.password");


        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, username, password);


        //预处理  处理 sql 语句 的对象
//        String sql= "insert into product values(20,'水浒传','88.8',6)";
        String sql ="update product set price = 88 where pid= 18 ";
        Statement statement = connection.createStatement();


        //执行  操作  返回改变的行数
        int rows = statement.executeUpdate(sql);
        if(rows>0){
            System.out.println("执行成功");
        }else {
            System.out.println("插入失败");

        }


        // 释放资源
        statement.close();
        connection.close();




    }
}
