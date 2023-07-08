package com.hainiuxy.Lambda3;

public class AddableDemo {
    public static void main(String[] args) {

        //匿名内部类
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x +y;

            }
        });

        //Lambda  方法有返回值  return语句
        useAddable((x,y)->x+y);

    }

    //使用函数式接口的场景
    public static void  useAddable(Addable a){
        int sum = a.add(10,20);
        System.out.println(sum);
    }

}
