package com.hainiuxy.api2;



public class Demo03_Integer {
    public static void main(String[] args) {
        Integer num1 = 10;
        Integer num2 = new Integer(10);
        System.out.println(num1);
        System.out.println(num2);
//        String s =(String) 10;
//        int x = (int)"10";
//        String s = num1.toString();
//        System.out.println(s);

        // valueOf  源码    return Integer.toString(i);

        //创建对象
        Integer in = Integer.valueOf(100);
        System.out.println(in);

        //对象再转换为基本数据类型
        int i =in.intValue();  // 返回 Integer的值作为 int
        System.out.println(i);

        Integer x =200;// 自动装箱 -- 自动将基本数据类型包装成对应的对象

//        x+=300;// x = x + 300  自动拆箱 -- 自动将对象类型拆成基本类型
        x = Integer.valueOf(x.intValue()+300);  //等价于  x+=300
        //把包装类转化为int基本数据类型   valueOf再转化为对象
        System.out.println(x);

// public static int parseInt(String s) 静态方法parseInt，
// 用于将参数字符串解析为整数值   参数字符串里面是整数

        int num = Integer.parseInt("123456");
        System.out.println(num);

    // 掌握字符串与int之间的互换
            // int -- String
        String s = String.valueOf(100);
//
// 转谁就找谁打点 两个方法都是静态的
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // 静态方法parseInt，用于将参数字符串解析为整数值
// 注意：字符串中的字符，除了第一个可以是+—表示正负，其它都必须是十进制数字
        //静态方法parseInt  用于将参数字符串解析为整数值

        int a = Integer.parseInt("45678");
        System.out.println(a);




    }
}
