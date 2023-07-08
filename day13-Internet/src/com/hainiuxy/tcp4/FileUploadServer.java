package com.hainiuxy.tcp4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*

        1实现文件名的随机  且 唯一
        2.将服务端设成多线程  接收多个客户端的请求

 */

public class FileUploadServer {
    public static void main(String[] args) throws IOException {

        // 创建服务端的Socket
        int port = 6669;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器启动");

        //创建一个线程池
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5,
                                10,
                                20,
                                TimeUnit.SECONDS,
                                new ArrayBlockingQueue<>(3),
                                Executors.defaultThreadFactory(),
                                new ThreadPoolExecutor.AbortPolicy());




//        new Thread(()->{
//
//
//        }).start();


            //有一个请求  就建立一次连接
        while(true){


            // 接收请求 建立连接
            Socket socket = serverSocket.accept();
            System.out.println("建立连接成功");
            //建立一次连接  就开启一条线程  完成数据的传输
            poolExecutor.submit(new FileUploadRunnable(socket));




        }





    }
}
