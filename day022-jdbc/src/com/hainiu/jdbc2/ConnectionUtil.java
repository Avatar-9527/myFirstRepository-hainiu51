package com.hainiu.jdbc2;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionUtil {

    private static String dirverName;
    private static String url;
    private static String username;
    private static String password;

     static {

         InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
         Properties properties = new Properties();
         try {
             properties.load(resourceAsStream);
         } catch (IOException e) {
             e.printStackTrace();
         }

         dirverName = properties.getProperty("jdbc.driver");
         url = properties.getProperty("jdbc.url");
         username = properties.getProperty("jdbc.username");
         password = properties.getProperty("jdbc.password");

         try {
             Class.forName(dirverName);
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }

     }
     public static Connection getConnection() throws SQLException {

        return  DriverManager.getConnection(url,username,password);


     }

     public static void close(Statement statement,Connection connection) throws SQLException {

         if(statement!=null){
             statement.close();
         }
         if(connection!=null){
             connection.close();
         }





     }




}
