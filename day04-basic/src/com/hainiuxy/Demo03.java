package com.hainiuxy;

import java.util.Random;

public class Demo03 {

    //带参无返回值  方法
    public static void printArray(int[] arr){


        System.out.print("[");
        //获取数组中的值   遍历数组
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }

        }

        System.out.println("]");


    }

    // 无参带返回值
    public static int getRandomNumber(){

        //定义随机数
        Random r = new Random();
        int num = r.nextInt(100)+1;
        return num;

    }



    //有参有返回值
    public static int gatMax(int[] arr){

        //寻找数组中最大元素
        //定义初始值
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }

        }

        return max;

    }

    public static void change(int number){
        number = 200;
        System.out.println("方法中："+number);
    }


    public static void main(String[] args) {

        //定义参数
        int[] arr1 ={1,2,3,4};
        //调用方法  传递参数
        printArray(arr1);


        int num = getRandomNumber();
        System.out.println(num);

        int[] arr = {1,4,4,2,6,6,7};
        int max = gatMax(arr);
        System.out.println(max);

        int number = 100;
        System.out.println("调用方法前："+number);
        change(number);
        System.out.println("调用方法后："+number);

    }

}
