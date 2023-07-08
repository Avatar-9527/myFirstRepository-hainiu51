package com.hainiuxy.oop;


public class TestStudent {
        //创建对象的格式：
        //类名  对象名 = new 类名();
        public static void main(String[] args) {
            //创建对象
            Student st = new Student();
            System.out.println(st);

            //属性  获取成员变量
            System.out.println(st.name);
            System.out.println(st.age);

            //给成员变量赋值
            st.name = "李华";
            st.age = 12;
            System.out.println(st.name);
            System.out.println(st.age);
            //行为
            st.study();

        }
}
