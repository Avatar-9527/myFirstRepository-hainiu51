package com.hainiuxy.generic;

public class Demo02 {
    public static void main(String[] args) {
        GenericClass<Integer> myClass = new GenericClass<Integer>();
        myClass.test(100);

        GenericClass<String> myClass2 = new GenericClass<String>();
        myClass2.test("adad");
    }
}
