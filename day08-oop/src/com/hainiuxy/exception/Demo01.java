package com.hainiuxy.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
1.在方法的声明上抛出异常  没有意义

2. 声明一个编译时异常，仅仅为了编译通过  如果代码没有问题，就正常执行；如果真的出现异常，仍然报错退出



 */
public class Demo01 {
    public static void main(String[] args) throws ParseException {

        /*int[] arr = new int[3];
        System.out.println(arr[3]); // 运行时异常

        System.out.println(1);*/


        String str = "2023-06-18 10:50:00";
        // 模式必须与字符串格式一致
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");

        Date d = sdf2.parse(str); // 编译时异常
        System.out.println(d);
    }
}
