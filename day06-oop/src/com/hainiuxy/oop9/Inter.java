package com.hainiuxy.oop9;



public class Inter {


    private String name = "a";


    //外部类使用内部类成员  创建对象
    public void fun(){
       InnerClass innerClass = new InnerClass();

       innerClass.setAddress("北京") ;
        System.out.println(innerClass.getAddress());

    }

    //内部类
    public class N{
        //内部类可以直接访问外部类的成员，包括私有
        public void test(){
            System.out.println(name);
        }


    }

    //静态内部类
    public static class StaticInnerClass{
        public void show(){
            System.out.println("StaticInnerClass");
        }
        public static void method() {
            System.out.println("StaticInner...staticmethod");
        }
    }


    //私有内部类  只能自己使用
    private class InnerClass{

        private String address;

        public String getAddress(){
            return address;
        }

        public void setAddress(String address){
            this.address =address;

        }


    }




}
