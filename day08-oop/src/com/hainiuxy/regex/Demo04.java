package com.hainiuxy.regex;


import java.util.Arrays;

/**
 *  "11 101 88 22 77 33 44 55"，请将其中的数据按照从小到大的顺序排列，
 *  组成一个新的字符串，仍然使用空格分割。
 *
 */
public class Demo04 {
    public static void main(String[] args) {

        String str = "11 101 88 22 77 33 44 55";

        //拆分  拿出来
        String[] strArr = str.split("\\s");
//        System.out.println(strArr);
        //整型数组
        int[] arr = new int[strArr.length];
        for(int i=0;i<str.length();i++){
            //将字符串类型的参数解析为整形数组
            arr[i] = Integer.parseInt(strArr[i]);

        }

        //整数数组排序
        Arrays.sort(arr);
//        System.out.println();

        //排序  拼接  存进去  再拼回字符串
        //转为对象   动态拼接字符串
        StringBuilder builder = new StringBuilder();

        for(int i=0;i<arr.length;i++){
            builder.append(arr[i]);
            //加入空格
            if(i<arr.length-1){
                builder.append(" ");
            }

        }

        String result = builder.toString();
        System.out.println(result);





    }
}
