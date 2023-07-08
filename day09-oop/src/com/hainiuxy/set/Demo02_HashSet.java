package com.hainiuxy.set;

/**
 * 1、当set集合添加元素时，需要与已经存在的元素进行比较
 *  * 2、首先比较两个对象的哈希码值
 *  *      如果不相同，那么判定是不同对象，直接存储
 *  *      如果相同，
 *  *         继续执行equals方法比较
 *  *              如果equals得到的是false，两个对象只是哈希值相同，但对象的属性不同，判定是不同对象，继续存储
 *  *              如果equals也返回true，那么两个对象相等，新元素不存储。
 *  *
 *  * HashSet保证元素唯一 依赖 hashCode 和 equals 方法
 *
 */
public class Demo02_HashSet {
    public static void main(String[] args) {


    }
}
