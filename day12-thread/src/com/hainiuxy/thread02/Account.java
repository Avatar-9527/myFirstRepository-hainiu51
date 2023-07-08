package com.hainiuxy.thread02;

public class Account {
    private volatile int money =1000;
//    private  int money =1000;

    //查看余额
    public int getMoney (){

        return money;
    }


    //取钱
    public void takeMoney(int x) throws InterruptedException {
        this.money-=x;
//        Thread.sleep(100);
        System.out.println("取出"+x+"元，还剩"+money);


    }


}
