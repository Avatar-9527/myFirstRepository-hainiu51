package com.hainiuxy.thread02;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
        双列集合  演示 线程安全问题


当添加元素时，判断是否哈希冲突
if ((p = tab[i = (n - 1) & hash]) == null)
	tab[i] = newNode(hash, key, value, null);
如果没冲突就直接赋值给数组当前索引。
当多线程操作时，线程A判断通过，进入方法，但线程B抢走执行权，此时判断仍然通过，也进入方法；线程A和B都会赋值成功，发生数据覆盖。


 */
public class Demo03 {
    public static void main(String[] args) throws InterruptedException {

        HashMap<String,String> hashMap =new HashMap<String,String>();
        Map<String, String> Map = Collections.synchronizedMap(hashMap);

        //一条线程  存储25个元素
        new Thread(()->{
            for(int i=1;i<=25;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Map.put(String.valueOf(i),String.valueOf(i));
            }

        }).start();

        new Thread(()->{
            for(int i=26;i<=50;i++){
                Map.put(String.valueOf(i),String.valueOf(i));
            }

        }).start();


        //保证上面的元素全部存储完毕
        Thread.sleep(1000);

        //获取元素
        for (int i = 1; i <=50; i++) {

            String s = Map.get(String.valueOf(i));
            System.out.println(i+"="+s);
        }
    }
}
