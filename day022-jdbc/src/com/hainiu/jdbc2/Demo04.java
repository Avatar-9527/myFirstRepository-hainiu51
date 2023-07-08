package com.hainiu.jdbc2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo04 {
    public static void main(String[] args) throws SQLException {

        //通过 工具类 获取连接
        Connection connection = ConnectionUtil.getConnection();

        Statement statement = connection.createStatement();
        String sql = "select *from product"; //  pid pname price cid


    }

}
