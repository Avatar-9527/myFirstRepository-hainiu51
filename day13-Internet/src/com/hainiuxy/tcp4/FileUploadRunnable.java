package com.hainiuxy.tcp4;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class FileUploadRunnable implements Runnable{

    private Socket socket;

    public FileUploadRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run(){

        // 读客户端的数据 写回反馈
        //获取输入流  读客户发送的文件数据
        //开输入流  指向本地文件  -- 放到当前模块下

        FileOutputStream out = null;
        try {
            InputStream in = socket.getInputStream();
            String name = UUID.randomUUID().toString().replaceAll("-","");

            //服务端  文件名固定   造成文件只有一个
            out = new FileOutputStream("C:\\Users\\50892\\Desktop\\新建文件夹 (3)\\学生证"+name+".jpg");

            // 读
            byte[] bytes = new byte[8192];

            int len;
            while ((len = in.read(bytes)) != -1) { // read 阻塞
                out.write(bytes,0,len);
            }

            //文件上传成功  给客户端反馈
            BufferedWriter writer =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("文件上传成功");
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 释放资源

            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            //断开连接
            if(socket!=null){

                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }




    }


}
