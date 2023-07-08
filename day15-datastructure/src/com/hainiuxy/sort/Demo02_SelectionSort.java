package com.hainiuxy.sort;

import java.util.Arrays;

/*

选择排序

 */
public class Demo02_SelectionSort {
    public static void main(String[] args) {

        int[] arr = {4,5,1,2,3,7,6};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static void selectSort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {

            //设定一个标记  因为 选择排序每轮排序选择一个最小的值放在数组中第一个 位置
            //而每轮会确定一个值得最终位置  标记需要后移  在最终确定位置的后面开始比较
            int key=i;
            //记录最小值出现的位置
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[key]){
                    key=j;

                }

            }
            //若起始位置不是最小值  则交换
            if(key!=i){

                int temp=arr[key];
                arr[key] =arr[i];
                arr[i] = temp;


            }
        }




    }
}
