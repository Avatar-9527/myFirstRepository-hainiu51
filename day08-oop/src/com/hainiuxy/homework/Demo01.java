package com.hainiuxy.homework;

import java.util.Random;
import java.util.Scanner;

/*
* 定义方法，获取一个包含4个字符的验证码，
        * 每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。
        *
        * 选择一个容器将可选的字符都保存进去，容器有索引，是连续的，随机获取到一个索引，相当于获取到随机的元素
        *
        * 通过索引操作元素
        *
        * 1、定义StringBuilder 将可选字符存入
        *
        * 2、随机索引
        *
        * 3、通过索引获取元素
        *
        * 请编写程序模拟验证码的判断过程，如果输入正确，给出提示，结束程序。
        * 如果输入错误，给出提示，验证码刷新，重新输入，直至正确为止。
        *
        *
        */
public class Demo01 {
    public static void main(String[] args) {

        //输入
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("系统产生的验证码为");
            String code = getCode();
            System.out.println(code);
            System.out.println("请输入验证码:");
            String inputCode = sc.nextLine();

            //对比  忽略大小写

            if(code.equalsIgnoreCase(inputCode)){
                System.out.println("验证通过");
                break;
            }else {
                System.out.println("验证码有误");
            }
        }


    }

    public static String getCode(){
        //存入字符  定义StringBuilder 将可选字符存入
        StringBuilder stringBuilder = new StringBuilder();

        for (char i='a';i<'z';i++){
            stringBuilder.append(i);
        }
        for (char i='A';i<'Z';i++){
            stringBuilder.append(i);
        }
        for (char i='0';i<'9';i++){
            stringBuilder.append(i);
        }



        //打乱取出  随机
        Random random =new Random();
        String result = "";
        //限制四次
        for(int i=0;i<4;i++){
            int index = random.nextInt(stringBuilder.length());
            //获取索引第一个字符
            result += stringBuilder.charAt(index);

        }
        return result;



    }
}
