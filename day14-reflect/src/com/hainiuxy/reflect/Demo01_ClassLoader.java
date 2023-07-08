package com.hainiuxy.reflect;

public class Demo01_ClassLoader {
    public static void main(String[] args) {

        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //系统类加载器  -- 获取父级
        ClassLoader classLoader = systemClassLoader.getParent();
        System.out.println(classLoader);//sun.misc.Launcher$ExtClassLoader@1b6d3586

        //扩展类加载器  父级

        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);//null   引导类加载器

    }
}
