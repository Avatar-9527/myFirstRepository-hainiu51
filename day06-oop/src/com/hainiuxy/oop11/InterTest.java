package com.hainiuxy.oop11;



public class InterTest {

   /*
   * 匿名内部类
   *  new 类名/方法名(){
   *    重写父类或者父类接口的方法
   *
   * }
   *
   * 本质：new出来的是继承了类或者实现了接口的  匿名  子类对象
   *
   * */

    public static void main(String[] args) {

        /*
        * Inter 表示要实现这个接口
        *  () 表示子类的构造方法
        * {}  表示子类的类体
        * */

        new Inter(){

            @Override
            public void fun(){
                System.out.println("重写后的fun方法");
            }
        }.fun();  //直接调用方法

        //接口多态

        Inter i = new Inter(){

            @Override
            public void fun(){
                System.out.println("重写后的fun方法");
            }
        };
        i.fun();

        //创建子类对象使用
        /*
        * */
        InterImpl ii = new InterImpl();
        ii.fun();

    }



}
