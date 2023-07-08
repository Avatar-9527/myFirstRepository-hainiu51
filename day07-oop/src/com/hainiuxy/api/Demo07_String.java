package com.hainiuxy.api;

public class Demo07_String {
    public static void main(String[] args) {
        String str = "hellojavaworldjavabigdata";


//        public int indexOf(int ch)
//
//        获取指定的字符在字符串中第一次出现的索引。如果没有，返回-1
        String key = "javase";
        int i = key.indexOf("j");
        System.out.println(i);

//        public int indexOf(int ch, int fromIndex)
//        获取指定的字符在字符串中第一次出现的索引，以指定的索引开始搜索。如果没有，返回-1

        int j = key.indexOf("j",2);
        System.out.println(j);

        //public String substring(int beginIndex)
        //    将调用方法的字符串从索引beginIndex处开始截取，
        //    一直到字符串结尾。返回一个新的字符串。
        String s = key.substring(1);
        System.out.println(s);

        //public String substring(int beginIndex, int endIndex)
        //    将调用方法的字符串从索引beginIndex处开始截取，
        //    一直到索引endIndex - 1处。返回一个新的字符串，
        //    长度为endIndex - beginIndex。

        String s1 = key.substring(1,3);
        System.out.println(s1);





    }
}
