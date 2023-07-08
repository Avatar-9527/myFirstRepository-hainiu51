package com.hainiuxy.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
/*

使用tcp协议  发送数据

        注意：一个Socket对象 获取到的输入和输出流是唯一的  关闭后就不可再开启使用
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {
        //创建tcp  发送端的Socket对象
        //public Scoket(InetAddress address,int port)
        /*
        InetAddress address 指定要连接的IP地址
        int port 要连接的IP地址上的端口号
         */
        //要连接的地址
        InetAddress address = InetAddress.getByName("192.168.62.137");
        //端口号
        int port =6669;
        //创建发送端的Socket对象
        Socket socket = new Socket(address,port);
        System.out.println("请求建立链接");

        //基于字节流  通过Socket 获取输入流
        OutputStream outputStream = socket.getOutputStream();

        //输出数据
        String data = "helllllllllllllllllllllllllll";
        //变味字节流
        outputStream.write(data.getBytes());



        //  释放资源
        outputStream.close();//向服务端写出一个结束标记

        socket.close();



    }
}
