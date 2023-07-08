package com.hainiuxy.oop6;

public class ImplTest  {

    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
//        int sum = ii.add(20,30);
//        System.out.println(sum);
        System.out.println(ii.add(10, 20));
        System.out.println();



        //静态方法只能通过接口名调用
        Inter.show();

    }
}
