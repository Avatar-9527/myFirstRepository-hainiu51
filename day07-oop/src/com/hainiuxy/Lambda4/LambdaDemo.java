package com.hainiuxy.Lambda4;

public class LambdaDemo {
    public static void main(String[] args) {
        //在主方法中调用 useAddable
//        useAddable((int x,int y)->{
//           return x+y;
//        });
        //参数类型可以省略

        useAddable((x,y)->{
            return x+y;
        });

        //如果代码块的语句只有一条  可以省略大括号和分号,如果有return
        //return 也要省略
//        useAddable((x,y)->x+y);
        
//        useFlyable((String s)->{
//            System.out.println(s);
//        });
//
//        //如果参数有且仅有一个  那么小括号可以省略
//        useFlyable(s->{
//            System.out.println(s);
//        });
//
//        //如果代码块语句只有一条，可以省略大括号和分号
//        useFlyable(s-> System.out.println(s));
//



    }

    private static void useFlyable(Flyable f){
        f.fly("风和日丽，晴空万里");
    }

    private static void useAddable(Addable a){
        int sum = a.add(10, 20);
        System.out.println(sum);
    }

}
