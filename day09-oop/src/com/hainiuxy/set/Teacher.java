package com.hainiuxy.set;


//参数  谁实现就写谁
public class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //实现方法
    /*
    返回值  正数  元素往后放
    负数  元素往前放
    0   元素重复不添加
     */
    //对扩展开放   对修改关闭
    @Override
    public int compareTo(Teacher o) {  //this 代表新元素  要存入的元素   o  已经存在的元素  进行比较
        //根据自己的实际业务  规定排序规则
        //年龄从小到大   年龄相同按照 姓名的自然顺序
        //都相同重复
        //按照年龄
        int num = this.age -o.age;
        //主要条件
        //再按照姓名  比较
        if(num==0){
            num = this.name.compareTo(o.name);

        }
        //不去重
        if(num==0){
            num =1;
        }


        return num;
    }

}
