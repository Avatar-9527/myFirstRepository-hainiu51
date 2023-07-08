package com.hainiuxy.sort;

import java.util.Arrays;

public class Demo01_BubbleSort {

    public static void main(String[] args) {
        //调用方法  传入数组
        int[] arr = {1,8,6,4,7,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }



    public static void bubbleSort(int[] arr){

        //健壮性
        if(arr ==null||arr.length==0){

            return;
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
                    swap(arr,j,j+1);

                }
            }
        }

    }
    //交换数组中的两个元素
    public static void swap(int[] arr1,int i ,int j){
        int temp =arr1[i];
        arr1[i] = arr1[j];
        arr1[j] = temp;
    }


}
