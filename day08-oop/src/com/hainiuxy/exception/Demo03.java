package com.hainiuxy.exception;

public class Demo03 {
    public static void main(String[] args) {


        try {
            int[] arr = new int[3];
            System.out.println(arr[3]); // 索引越界异常

            String str = null;
            System.out.println(str.length()); // 空指针异常
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); //异常消息
            System.out.println(e.toString()); //异常名称和异常消息
            System.out.println("索引越界异常");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }



        try {
            int[] arr = new int[3];
            System.out.println(arr[3]); // 索引越界异常

            String str = null;
            System.out.println(str.length()); // 空指针异常

            //catch 语句捕获多个异常  用 | 连接  不能有字父类关系  jdk7
        } catch (ArrayIndexOutOfBoundsException |NullPointerException e) {
            System.out.println("索引越界异常");
        }

    }
}
