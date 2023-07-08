package com.hainiuxy.tcp4;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class FileUploadClient {
    public static void main(String[] args) throws IOException {
        //地址
        InetAddress address = InetAddress.getByName("192.168.62.137");
        //端口号
        int port = 6669;
        //创建发送端的Socket
        Socket socket = new Socket(address,port);

        //读文件
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\50892\\Desktop\\新建文件夹 (3)\\学生证.jpg");

        //写到网络
        OutputStream outputStream =socket.getOutputStream();


        byte[] bytes = new byte[8192];

        int len;
        while((len=fileInputStream.read(bytes))!=-1){   //read  阻塞
           outputStream.write(bytes,0,len);

        }

        //文件传输完毕  给服务器一个结束标记
        socket.shutdownOutput();

        //读反馈
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s =reader.readLine();
        System.out.println(s);

        //释放资源
        //指向文件的输入流
         fileInputStream.close();
         //网络管道  断开连接
         socket.close();


    }
}
