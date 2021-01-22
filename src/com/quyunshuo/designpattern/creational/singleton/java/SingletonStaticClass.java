package com.quyunshuo.designpattern.creational.singleton.java;

/**
 * 4.单例模式-静态内部类
 * 这种方式同样利用了类加载机制来保证只创建一个instance实例。
 * 它与饿汉模式一样，也是利用了类加载机制，因此不存在多线程并发的问题。
 * 不一样的是，它是在内部类里面去创建对象实例。
 * 这样的话，只要应用中不使用内部类，JVM就不会去加载这个单例类，也就不会创建单例对象，从而实现懒汉式的延迟加载。
 * 也就是说这种方式可以同时保证延迟加载和线程安全。
 */
public class SingletonStaticClass {

    private static class SingletonHolder {
        public static SingletonStaticClass instance = new SingletonStaticClass();
    }

    private SingletonStaticClass() {
    }

    public static SingletonStaticClass newInstance() {
        return SingletonHolder.instance;
    }
}