package com.hainiuxy.exception;

import java.util.Scanner;

/*
自定义异常
 */
public class Demo04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();


        System.out.println("请输入姓名");
        String name = sc.nextLine();
        student.setName(name);
        while(true){
            System.out.println("请输入年龄");
            String ageStr =sc.nextLine();

            try {
                int age = Integer.parseInt(ageStr);
                student.setAge(age);
                System.out.println(student);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("年龄必须是整数， 请重新输入");
            } catch(AgeOutOfBoundsException e){
               e.printStackTrace();


            }

            System.out.println("后续代码");




        }

    }
}
