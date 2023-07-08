package com.hainiuxy.oop8;

public class AnimalTest {

    public static void main(String[] args) {
        //父类引用指向子类
        Cat cat = new Cat();


        //当前对象是动物
        Animal a = new Cat();

        //调用成员变量
        // 编译看父类有没有这个变量
        //运行看父类成员变量的值  == 因为变量没有重写的概念
        // 20
        System.out.println(cat.num);

        //10
        System.out.println(a.num);

        /*
        *
        * 调用成员方法
        * 编译看父类有没有这个方法
        * 运行看子类重写的方法  -- 因为方法被子类重写  真正创建的是子类对象
        * a.eat();
        * */

        //编译期只查看语法
        Dog  dog = new Dog();
        useDog(dog);

        useAnimal(dog);



        cat.eat();
        useCat(cat);



    }

    public static void useAnimal(Animal animal){
        animal.eat();//运行的方法时具体传过来的子类的


    }

    //方法的参数是一个类  将来调用方法传递的是该类的对象
    public static void useDog(Dog dog){
        dog.eat();
    }
    public static void useCat(Cat cat){
        cat.eat();
    }


}
