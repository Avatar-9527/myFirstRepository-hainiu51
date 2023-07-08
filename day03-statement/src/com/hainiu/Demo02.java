package com.hainiu;

public class Demo02 {
    public static void main(String[] args) {
        //定义对象
        double mountain = 8844430;
        double paper = 0.1;
        //计数器
        int count = 0;
        //循环计算
        while(paper <= mountain){
            paper *=2;
            System.out.println("纸张厚度："+paper);
            count++;
        }
        System.out.println(count+"次");


        for(;paper <=mountain ;paper*=2){
            count++;
            System.out.println(paper+"次");

        }
        System.out.println(count+"次");

    }

}
