package com.hainiuxy.search;

import java.util.Arrays;

/*

二分查找   前提：数组有序

 */
public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9};
        int i = Arrays.binarySearch(arr, 2); // -6  -(插入点+1)
        System.out.println(i);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }

    public static int binarySearch(int[] arr,int key){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int mid = (start+end)/2;

            if(arr[mid]>key){
                //左边
                end=mid-1;
            }else if(arr[mid]<key){
                start=mid+1;
            }else {
                return mid;
            }


        }
        return -1;


    }

}
