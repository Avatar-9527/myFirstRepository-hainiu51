package com.hainiuxy.sort;

import java.util.Arrays;

public class Demo03_InsertSort {
    public static void main(String[] args) {

        int[] arr = {2,6,3,4,1,6};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));



    }


    public static void insertSort(int[] arr){

        //每次都与前面已经有序的后面比较 插入
        //外层  总排序次数  从第二个元素开始   找到小的元素  直接与前面已经有序数组，直接插入到相应的位置

        for(int i=1;i<arr.length;i++){

            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }




}
