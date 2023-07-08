package com.hainiuxy.lambda5;

import java.util.Arrays;
import java.util.Comparator;

public class Demo05 {
    public static void main(String[] args) {
//        // Arrays 工具类中   sort 方法  排序
//        int[] arr ={2,1,7,3,5,9,4,6};
//
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println("---------------------------");
//
//        //字符串数组  默认按照自然顺序排序
//
        String[] strArr = {"Tom", "Jerry", "Jack", "Rose", "John", "Lily", "Lucy"};
//
//        Arrays.sort(strArr);
//
//        System.out.println(Arrays.toString(strArr));
//        System.out.println("-------------------------");

        //按照长度从小大小  排序  比较器：排序规则
        //自然排序
        Arrays.sort(strArr,new Comparator<String>(){

            @Override
            public int compare(String s1,String s2){
                return s2.length()-s1.length();
            }


        });
//        Arrays.sort(strArr,(String s1,String s2)->{
//            return s1.length()-s2.length();
//        });

        System.out.println(Arrays.toString(strArr));


    }
}
