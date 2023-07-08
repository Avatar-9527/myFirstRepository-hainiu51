package com.hainiuxy;

public class Demo01 {

    public static void main(String[] args) {
        int[] arr = {1,2,6,8,4,2,5,10};
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){

            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println(max);


        for (int i :arr) {
            System.out.println();
        }

    }


}



