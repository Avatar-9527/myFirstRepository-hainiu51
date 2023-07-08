package com.hainiuxy.thread03;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello"+i);
        }

        return "over";
    }


}
