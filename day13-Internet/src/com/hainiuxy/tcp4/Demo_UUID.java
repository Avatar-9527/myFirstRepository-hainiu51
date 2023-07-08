package com.hainiuxy.tcp4;

import java.util.UUID;

public class Demo_UUID {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String s1 =UUID.randomUUID().toString();
            String s = UUID.randomUUID().toString().replaceAll("-","");
            System.out.println(s);
            System.out.println(s1);
        }

    }
}
