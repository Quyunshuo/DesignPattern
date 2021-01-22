package com.quyunshuo.designpattern.creational.singleton.java;

/**
 * 2.单例模式-懒汉式-线程同步锁
 * 懒汉模式中单例是在需要的时候才去创建的，如果单例已经创建，再次调用获取接口将不会重新创建新的对象，而是直接返回之前创建的对象。
 * 并且加锁保证了线程同步问题。
 * 如果某个单例使用的次数少，并且创建单例消耗的资源较多，那么就需要实现单例的按需创建，这个时候使用懒汉模式就是一个不错的选择。
 */
public class SingletonLock {
    private static SingletonLock instance = null;

    private SingletonLock() {
    }

    public static synchronized SingletonLock newInstance() {
        if (null == instance) {
            instance = new SingletonLock();
        }
        return instance;
    }
}