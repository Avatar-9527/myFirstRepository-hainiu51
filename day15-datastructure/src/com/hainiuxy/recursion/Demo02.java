package com.hainiuxy.recursion;


/*

递归的应用：
 *      删除文件夹 -- 递归删除
 *      统计文件夹的大小

5x5方格 最短路径

 */
public class Demo02 {
    public static void main(String[] args) {

        System.out.println(marge(2,2));

    }

    public static int marge(int x,int y){

        if(x==4||y==4){
            return 1;
        }

        return marge(x,y+1)+marge(x+1,y);
    }
}
