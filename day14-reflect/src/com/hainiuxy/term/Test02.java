package com.hainiuxy.term;

import java.util.HashSet;

public class Test02 {
    public static void main(String[] args) {

        int[] arr1 ={1,3,5,9};

        int[] arr2 ={3,5,8,9,0,8,2,4};
        int[] jiaoji = jiaoji(arr1, arr2);




        //输出
        System.out.print("交集是："+"{");
        for (int i=0;i<jiaoji.length;i++) {
            System.out.print(jiaoji[i]);
            if(i<jiaoji.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");



    }


    //定义方法   定义HashSet  单列集合
    public static int[] jiaoji(int[] arr1,int[] arr2){

        //定义两个集合存入数组中元素
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        //把数组arr1 放入集合中
        for (int i : arr1) {
            set1.add(i);
        }

        //把arr1与arr2中相同的元素放入集合set2
        for (int i : arr2) {
            if(set1.contains(i)){
                set2.add(i);

            }
        }

        //取出集合中元素  转为数组
        int[] arr3=new int[set2.size()];

        int n=0;
        for (Integer num : set2) {
            arr3[n]=num;
            n++;
        }

        /*System.out.println("交集是：");
        System.out.print("{");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if(i<arr3.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");*/


        return arr3;

    }
}
