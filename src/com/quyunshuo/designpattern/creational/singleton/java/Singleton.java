package com.quyunshuo.designpattern.creational.singleton.java;

/**
 * 1.单例模式-饿汉式
 * 从代码中我们看到，类的构造函数定义为private的，保证其他类不能实例化此类，然后提供了一个静态实例并返回给调用者。
 * 饿汉模式是最简单的一种实现方式，饿汉模式在类加载的时候就对实例进行创建，实例在整个程序周期都存在。
 * 它的好处是只在类加载的时候创建一次实例，不会存在多个线程创建多个实例的情况，避免了多线程同步的问题。
 * 它的缺点也很明显，即使这个单例没有用到也会被创建，而且在类加载之后就被创建，内存就被浪费了。
 * 这种实现方式适合单例占用内存比较小，在初始化时就会被用到的情况。
 * 但是，如果单例占用的内存比较大，或单例只是在某个特定场景下才会用到，使用饿汉模式就不合适了，这时候就需要用到懒汉模式进行延迟加载。
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton newInstance() {
        return instance;
    }
}