package com.hainiuxy.oop1;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.drink();
        Dog dog = new Dog();
        dog.eat();
        dog.drink();
        //抽象类不能实例化
//        Animal animal = new Animal();

    }
}
