package com.hainiuxy.udp;

import java.io.IOException;
import java.net.*;

public class UdpClient {
    public static void main(String[] args) throws IOException {

        //创建UDP协议的发送端  Socket 对象  随机绑定一个端口号启动客户端  发送数组
        DatagramSocket socket =new DatagramSocket();

        //要发送的数据
        String str = "Error:(10, 32) java: 未报告的异常错误java.net.SocketException; 必须对其进行捕获或声明以便抛出";

        //传输的数据  字节数组
        byte[] bytes = str.getBytes();

        //IP地址
        InetAddress addr = InetAddress.getByName("192.168.62.116");
        //端口号
        int port = 10023;

        //
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,addr,port);
        //发送
        socket.send(packet);

        //释放资源
        socket.close();




    }
}
