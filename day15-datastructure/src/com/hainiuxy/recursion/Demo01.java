package com.hainiuxy.recursion;


/*


1、理解数据结构的三个内容（逻辑关系【线性、树、图、集合】、存储关系【顺序、链式】、操作）
 *
 * 2、理解各个算法的原理，代码练习一遍
 *      青蛙跳台阶  1-2级   30级多少种跳法

 1    1 	2	3	5	8	13	21	...   斐波那契数列
 */
public class Demo01 {
    public static void main(String[] args) {

        System.out.println(feibo3(5));


    }

    //递归实现
     public static int feibo2(int n){

        //出口
         if(n==1||n==2){
             return 1;
         }
         return feibo2(n-1)+feibo2(n-2);

     }


    //动态规划的思想实现
    public static int feibo(int n){
        if(n==1||n==2){

            return 1;
        }

        //将数列的每一列存入数组
        //前两项和已知
        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1]+arr[i-2];

        }
        //数组的最后一项
        return arr[n-1];
    }

    //空间复杂度为O(1) 的动态规划的思想
    public static int feibo3(int n){
        if(n==1||n==2){
            return 1;
        }

        //
        int last=1;
        int nextToLast =1;
        int answer =1;

        for(int i=2;i<n;i++){

            answer =last+nextToLast;
            last =nextToLast;
            nextToLast=answer;

        }

        return answer;

    }

}
