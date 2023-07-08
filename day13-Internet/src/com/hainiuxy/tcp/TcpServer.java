package com.hainiuxy.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*

使用tcp协议  接收数据

 */
public class TcpServer {
    public static void main(String[] args) throws IOException {

        //创建服务器Socket对象  -- 绑定指定端口号启动
        int port = 6669;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器启动，绑定端口号："+port);

        //接收链接  -- 返回Socket对象
        Socket socket  =serverSocket.accept();  //阻塞式 连接
        System.out.println("连接建立成功");

        //通过Socket 对象获取输入流读取数据
        InputStream inputStream = socket.getInputStream();


        byte[] bytes = new byte[1024];

        int len;
        while((len=inputStream.read(bytes))!=-1){   //read  阻塞
            //获取数据
            String s =new String(bytes,0,len);
            System.out.println(s);


        }
        System.out.println("读入到了结束标记");




        //获取发送主机地址
        String hostAddress = socket.getInetAddress().getHostAddress();
        System.out.println(hostAddress);

        //释放资源
        //关闭字节流
        inputStream.close();
        //关闭socket
        socket.close();
        //关闭服务器
        serverSocket.close();



    }


}
