package com.hainiuxy.term;

public class Test04_Test {
    public static void main(String[] args) {
        Test04 test04 =new Test04();

        Thread threadA = new Thread(test04);
        Thread threadB = new Thread(test04);
        Thread threadC = new Thread(test04);
        threadA.setName("线程A");
        threadB.setName("线程B");
        threadC.setName("线程C");
        threadA.start();
        threadB.start();
        threadC.start();



    }
}
