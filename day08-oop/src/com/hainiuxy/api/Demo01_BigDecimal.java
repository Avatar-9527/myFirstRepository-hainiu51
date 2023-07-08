package com.hainiuxy.api;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo01_BigDecimal {
    public static void main(String[] args) {
        System.out.println(1.1+0.8);

        // public BigDecimal(String val)
        // 将BigDecimal的十进制字符串表示形式转换为BigDecimal对象
        // 字符串的第一位可以是+、-表示正负号或者数字，其他位必须为数字
        //加法
        BigDecimal b = new BigDecimal("1.1");
        System.out.println(b);
        BigDecimal a = new BigDecimal("0.8");
        System.out.println("---------------加法---------");
        BigDecimal c= b.add(a);

        System.out.println(c);

        //获取基本数据类型的值
        double value = c.doubleValue();
        System.out.println(value);


                /*
        this / divisor

        this 被除数
        divisor 除数
        scale 当除不尽时，保留的小数位数（精确到小数点后面多少位）
        RoundingMode 精确位的后面一位的舍入模式，常用的模式有
            RoundingMode.UP			正数向右边靠，负数向左边靠
            RoundingMode.DOWN		正数向左边靠，负数向右边靠
            RoundingMode.CEILING	全向右靠，向大靠拢
            RoundingMode.FLOOR		全向左靠，向小靠拢
            RoundingMode.HALF_UP	四舍五入
            RoundingMode.HALF_DOWN	五舍六入
        */
        System.out.println("-----------------");
        BigDecimal x = new BigDecimal("10");
        BigDecimal y = new BigDecimal("3");

        System.out.println("----------------------除法-----------------");
        //除法
        BigDecimal z = x.divide(y, 10, RoundingMode.HALF_UP);

        System.out.println(z);


//        double v = DoubleUtil.add(1.1, 0.8);
//        double v = DoubleUtil.add(1.1,0.8);
//        System.out.println(v);

        //乘法
        System.out.println("------乘法--------------");
        BigDecimal a1 = new BigDecimal("3");
        BigDecimal b2 = new BigDecimal("5");
        BigDecimal c2 = a1.multiply(b2);
        System.out.println(c2);


        //减法
        System.out.println("-----------减法----");
        BigDecimal a2 = new BigDecimal("5.0");
        BigDecimal b3 = new BigDecimal("3");
        BigDecimal c3 = a2.subtract(b3);
        //除法
        BigDecimal c4 = a2.divide(b3, 3, RoundingMode.DOWN);
        System.out.println(c3);
        System.out.println(c4);




    }

}
