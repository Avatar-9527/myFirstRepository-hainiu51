package com.hainiuxy.tcp02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;


/*


 */
public class TcpClient {
    public static void main(String[] args) throws IOException {
        //地址
        InetAddress address = InetAddress.getByName("192.168.62.137");
        //端口号
        int port = 6669;
        //创建发送端的Socket
        Socket socket = new Socket(address,port);

        //发送数据
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream =socket.getInputStream();

        //发送一句话  转为字节流
        outputStream.write("11111111111".getBytes());

        //读取反馈
        byte[] bytes = new byte[1024];
        int len =inputStream.read(bytes);
        String s = new String(bytes,0,len);
        System.out.println("服务器返回到反馈数据"+s);

        inputStream.close();
        outputStream.close();
        socket.close();


    }
}
