package com.hainiu;

public class Demo04 {
        //水仙花数
        public static void main(String[] args) {
        int count = 0;
        for(int i = 100;i<1000;i++){
            int a = i %10;
            int b = i /10 %10;
            int c = i / 100 %10;
            if(a*a*a +b*b*b +c*c*c == i){
                System.out.println(i);
                count ++;
            }


        }
        System.out.println("水仙花数共有："+count+"个");

        }



}
