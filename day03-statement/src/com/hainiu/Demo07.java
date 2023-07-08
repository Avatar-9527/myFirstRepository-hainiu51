package com.hainiu;

import java.util.Random;

public class Demo07 {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0;i< 10;i++){

            int r = random.nextInt(10);
            System.out.println(r);

        }

        int num = random.nextInt(10)+1;
        System.out.println(num);
    }

}
