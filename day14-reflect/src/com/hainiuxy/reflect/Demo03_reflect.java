package com.hainiuxy.reflect;


/*


Constructor[] getConstructors()
	获取此 Class 对象所表示的类的所有公共构造方法。
Constructor[] getDeclaredConstructors()
	获取此 Class 对象表示的类声明的所有构造方法（包含私有）。

Constructor<T> getConstructor(Class... parameterTypes)
	获取此 Class 对象所表示的类的指定公共构造方法。
Constructor getDeclaredConstructor(Class... parameterTypes)
	获取此 Class 对象所表示的类的指定构造方法（包括私有和默认修饰）。
	参数：构造方法是什么参数，按顺序写这些参数的class对象即可  例如：String.class

    使用构造器  创建对象
    Constructor类提供的API：
	public T newInstance(Object... initargs)
		使用此Constructor对象表示的构造函数，
		使用指定的初始化参数创建和初始化构造函数的声明类的对象。
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo03_reflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取类的字节码文件对象
        Class<Student> clazz = (Class<Student>)Class.forName("com.hainiuxy.reflect.Student");

//        //获取此 Class 对象所表示的类的所有公共构造方法。
//
//        Constructor<?>[] constructors = clazz.getConstructors();
//        for (Constructor<?> constructor : constructors) {
//            System.out.println(constructor);
//        }

//       Constructor<Student>[] declareConstructors =(Constructor<Student>[]) clazz.getDeclaredConstructors();
//        for (Constructor<Student> declareConstructor : declareConstructors) {
//            System.out.println(declareConstructor);
//        }

        //根据参数匹配  获取一个公共的
        Constructor<Student> constructor=clazz.getConstructor();

        System.out.println(constructor);

        Student student = constructor.newInstance();
        System.out.println(student);

        //获取公共的带参构造  创建对象
        Constructor<Student> c2=clazz.getConstructor(String.class,int.class);
        Student s2 =c2.newInstance("tom",12);
        System.out.println(s2);

        //访问不了  私有的成员
        Constructor<Student> c3=clazz.getDeclaredConstructor(String.class);
        System.out.println(c3);

        //如果权限不够  取消java语言的访问权限检查
        c3.setAccessible(true); //暴力反射
        Student s3 =c3.newInstance("tom1");
        System.out.println(s3);


//        //获取一个声明的
//        Constructor<Student> constructor1 =clazz.getDeclaredConstructor(String.class);
//
//        System.out.println(constructor1);












//        System.out.println(add());
//        System.out.println(add(1));
//        System.out.println(add(1,2));
//        System.out.println(add(1,2,3));
//
//        int[] arr =new int[]{4,5,6};
//        System.out.println(add(arr));



    }

//    //可变参数  数据类型相同  但个数不确定 （0-n）个  本质：就是一个数组
//    public static  int add(int... arr){
//        int sum =0;
//        for(int num :arr){
//            sum+=num;
//        }
//        return sum;
//    }
}
