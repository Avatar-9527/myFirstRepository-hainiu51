package com.hainiuxy.thread1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import static javafx.scene.input.KeyCode.L;
import static sun.misc.PostVMInitHook.run;

public class Test {
    public static void main(String[] args) {
        //继承Thread 类


        //匿名内部类
        new Thread(){
            @Override
            public void run(){
                System.out.println("线程执行");
            }
        }.start();

        //实现Runnable 接口
        new Thread(()-> System.out.println("线程执行")).start();




//        (Thread) run()->{
//            System.out.println("线程执行");
//        };
        //实现Runnable接口

        new Thread(()-> System.out.println("线程执行")).start();

        //操作共享数据  做出修改
        //synchronized
        //lock

    }


    }


