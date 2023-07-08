package com.hainiuxy.api;



public class Demo08_String {

    public static void main(String[] args) {
        String s = "古人有很多描述桃花的诗句。" +
                "白居易在《大林寺桃花》中说：人间四月芳菲尽，山寺桃花始盛开；" +
                "崔护在《题都城南庄》中说：人面不知何处去，桃花依旧笑春风；" +
                "王维在《桃源行》中说：渔舟逐水爱山春，两岸桃花夹古津...春来遍是桃花水，不辨仙源何处寻；" +
                "唐寅在《桃花庵歌》中也描述：桃花坞里桃花庵，桃花庵里桃花仙。桃花仙人种桃树，又摘桃花换酒钱...";
        // 统计 桃花 一词出现的次数


        //计数
//        int count=search1(s,"桃花");
//        System.out.println(count);
        int count = search2(s,"桃花");
        System.out.println(count);


        /**
         * 在str中查找key出现的次数
         * @paramstr
         * @paramkey
         * @return
         */
    }

    public static int search2(String str,String key){
        //计数器
        int count=0;

        //查找   查找到后  在字符串后接着查找  index = index +key.length
        int index =0;
        while((index=str.indexOf(key,index))!=-1){
            index = index + key.length();
            count++;

        }

        return count;




    }



    public static int search1(String str,String key){





        //计数器
        int count = 0;
        //查找
        int index;
        while((index =str.indexOf(key))!=-1){
            //找到了
            count++;
            // 截取掉已经查找过的部分，从本次找到的索引位置 + 关键词的长度，将截取的结果覆盖原串
            str = str.substring(index+key.length());

        }


        return count;
    }





}
