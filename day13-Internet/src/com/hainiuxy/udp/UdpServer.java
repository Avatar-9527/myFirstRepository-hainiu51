package com.hainiuxy.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
    public static void main(String[] args) throws IOException {

        //创建UDP  接收端 Socket 对象  绑定指定的端口号启动

        int port = 10086;
        DatagramSocket socket = new DatagramSocket(port);

        //打包接收
        //public DatagramPacket(byte buf[], int length)
        //byte buf[]  接收数据的字节数组
        //int length  接收数组的最大长度
        byte[] bytes = new byte[1024];


        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);

        while(true){

            //接收
            socket.receive(packet);
            //解析包裹  得到数据
            int length = packet.getLength();
//        byte[] data = packet.getData();  上方已经定义数组
            String str = new String(bytes,0,length);

            String hostAddress = packet.getAddress().getHostAddress();


            System.out.println(hostAddress+" 说："+str);

        }
//        socket.close();

    }
}
