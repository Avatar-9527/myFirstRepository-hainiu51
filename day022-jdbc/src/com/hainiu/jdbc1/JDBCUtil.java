package com.hainiu.jdbc1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*

    JDBC 对 jdbc 的通用操作 实现   注册 驱动   建立 连接  释放资源

 */
public class JDBCUtil {
        private JDBCUtil(){


        }

        // 定义 四个 成员 变量   表示连接数据库的四个属性

        private static String dirverName;
        private static String url;
        private static String username;
        private static String password;


        //注册 驱动

        static {

            //读取配置文件 四个属性 b
            InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");

            Properties properties = new Properties();

            try {
                properties.load(stream);
            } catch (IOException e) {
                e.printStackTrace();
            }

            dirverName = properties.getProperty("jdbc.driver");
            url = properties.getProperty("jdbc.url");
            username = properties.getProperty("jdbc.name");
            password= properties.getProperty("jdbc.password");


            try {
                Class.forName(dirverName);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        // 建立 连接

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url,username,password);

        }

        //释放资源
        public static void  close(Statement statement,Connection connection) throws SQLException {
            if(statement!=null){

                statement.close();
            }

            if(connection!=null){

                connection.close();
            }


        }



}
