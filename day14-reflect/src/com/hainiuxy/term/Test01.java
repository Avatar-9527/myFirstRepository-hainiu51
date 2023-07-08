package com.hainiuxy.term;

public class Test01 {
    public static void main(String[] args) {

        //定义字符串
        String str ="人间四月芳菲尽，山寺桃花始盛开；" +
                "崔护在《题都城南庄》中说：人面不知何处去，桃花依旧笑春风；" +
                "王维在《桃源行》中说：渔舟逐水爱山春，两岸桃花夹古津...春来遍是桃花水，" +
                "不辨仙源何处寻；唐寅在《桃花庵歌》中也描述：桃花坞里桃花庵，" +
                "桃花庵里桃花仙。桃花仙人种桃树，又摘桃花换酒钱...";

        //要寻找的字符
        String s="桃花";


        //调用方法
        int num = find(str,s);
        System.out.println(num);



    }

    //返回次数   传入参数为原字符串  要找的字符串
    public static int find(String str,String s){
        //计数器
        int count=0;

        //定义索引
        int index=0;

        //寻找字符  找到后更新索引
        while((index =str.indexOf(s,index))!=-1){

            index = index +s.length();
            count++;


        }

        return count;
    }



}
