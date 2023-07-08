package com.hainiu.jdbc1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Demo03 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        //通过 工具类 获取 连接
        Connection connection = JDBCUtil.getConnection();

        //处理sql语句 的对象
        String sql ="delete from product where pid =18 ";

        Statement statement = connection.createStatement();


        //执行  操作  返回改变的行数
        int rows = statement.executeUpdate(sql);
        if(rows>0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");

        }


        // 释放资源
        JDBCUtil.close(statement,connection);


    }
}
