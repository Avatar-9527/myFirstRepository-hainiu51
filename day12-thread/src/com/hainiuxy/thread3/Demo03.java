package com.hainiuxy.thread3;

/*

Properties 是Map集合的一员
Properties 类表示一组持久的属性
Properties 可以保存到流中  或者 从流中加载

属性列表中的每个键及其对应的值都是一个字符串

 */

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo03 {
    public static void main(String[] args) {
        //Properties 作为Map集合的使用
        Properties properties = new Properties();

        //添加一对属性  属性名=属性值

        properties.setProperty("name", "Tom");
        properties.setProperty("age", "23");
        properties.setProperty("address", "beijing");
        properties.setProperty("tel", "12345678");

        //遍历

//        Set<Object> keyset = properties.keySet();
//        for (Object key:keyset) {
//            Object value = properties.get(key);
//            System.out.println(key+"="+value);
//        }
//
//
//        Set<Map.Entry<Object,Object>> entries =properties.entrySet();
//
//        for (Map.Entry<Object,Object> entry:entries) {
//            Object key =entry.getKey();
//            Object value = entry.getValue();
//            System.out.println(key+"="+value);
//
//        }
//
//        properties.forEach((k,v)->{
//            System.out.println(k+"="+v);
//        });


        //特有的  自己的遍历方式
        Set<String> propertiesNames = properties.stringPropertyNames();
        for (String propertyName:propertiesNames){
            String propertyValue = properties.getProperty(propertyName);
            System.out.println(propertyName+"="+propertyValue);

        }


    }
}
