package com.hainiu.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*


        解决   数据库 的相关属性 写死的问题   --  利用 配置文件

 */
public class Demo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {



        // 加载驱动   在com.mysql.jdbc.Driver 类中  有注册驱动的静态代码块  让该类 加载
        //
        Class.forName("com.mysql.jdbc.Driver");

        //数据库 连接 的四大属性
        String url = "jdbc:mysql://11.90.214.81:3306/hainiu51?useSSL=false&characterEncoding = UTF-8";
        String username ="root";
        String password = "hainiu";
        String driver = "com.mysql.jdbc.Driver";

        //建立连接

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
