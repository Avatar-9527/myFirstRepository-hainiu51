package com.hainiuxy.Demo04;

public class TicketWindowTest {
    public static void main(String[] args) {
        TicketWindow ticketWindow = new TicketWindow();

        //开启两条线程

        new Thread(ticketWindow,"窗口一").start();
        new Thread(ticketWindow,"窗口二").start();

    }
}
