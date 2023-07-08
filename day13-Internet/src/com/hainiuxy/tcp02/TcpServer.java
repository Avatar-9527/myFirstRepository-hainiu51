package com.hainiuxy.tcp02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {

        //创建服务端的Socket
//        InetAddress address =InetAddress.getByName("192.168.62.137");
        int port =6669;
        ServerSocket serverSocket =new ServerSocket(port);

        //接收请求  建立连接
        Socket socket = serverSocket.accept();
        //读客户端的数据  写回反馈
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream =socket.getInputStream();

        //读取反馈
        byte[] bytes = new byte[1024];
        int len =inputStream.read(bytes);
        String s = new String(bytes,0,len);
        System.out.println("服务器返回到反馈数据"+s);

        //写
        outputStream.write("这是服务端给客户端的一句话".getBytes());

        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();



    }
}
