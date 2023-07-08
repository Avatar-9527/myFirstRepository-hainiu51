package com.hainiuxy.oop3;

public abstract class RuntimeTemplate {

    public final long getTime(){

        //起始时间
        long start = System.currentTimeMillis();

        //执行代码
        code();


        //结束时间

        long end = System.currentTimeMillis();
        //时间差

        return end - start;



    }


    public abstract void code();



}
