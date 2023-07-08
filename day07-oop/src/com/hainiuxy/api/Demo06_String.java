package com.hainiuxy.api;

public class Demo06_String {
    public static void main(String[] args) {

        // public boolean contains(CharSequence s)
        //判断调用方法的字符串中是否包含指定的子串，如果包含，返回true。
        String s = "helloworldjava";

        boolean b = s.contains("javase");
        System.out.println(b);

        // public boolean endsWith(String suffix)
//        判断调用方法的字符串是否以指定的后缀结尾，如果是，返回true

        String filePath = "C:\\Users\\D\\Desktop\\环境软件.png";
        boolean f = filePath.endsWith(".png");
        System.out.println(f);

//        public boolean startsWith(String prefix)
        // 判断调用方法的字符串是否以指定的前缀开头，如果是，返回true
        boolean s1 = filePath.startsWith("C");
        System.out.println(s1);

//        public boolean isEmpty()
//        判断调用方法的字符串是否为空（长度为0），如果是，返回true
//        注意：判断对象是否为null，应使用（对象 == null）

        String empty ="";
        boolean e = empty.isEmpty();
        System.out.println(e);



        //空指针异常    s3没有对象    不指向栈中的引用  堆的任何空间
        String n = null;
        if(n == null){
            System.out.println(n.isEmpty());
        }
        System.out.println(n.isEmpty());



    }


}
