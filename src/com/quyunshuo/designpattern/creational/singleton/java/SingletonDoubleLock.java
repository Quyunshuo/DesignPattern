package com.quyunshuo.designpattern.creational.singleton.java;

/**
 * 3.单例模式-懒汉式-双重校验锁
 * 加锁的懒汉模式看起来即解决了线程并发问题，又实现了延迟加载，然而它存在着性能问题，依然不够完美。
 * synchronized修饰的同步方法比一般方法要慢很多，如果多次调用getInstance()，累积的性能损耗就比较大了。
 * 因此就有了双重校验锁
 * 可以看到下面在同步代码块外多了一层instance为空的判断。由于单例对象只需要创建一次，如果后面再次调用getInstance()只需要直接返回单例对象。
 * 因此，大部分情况下，调用getInstance()都不会执行到同步代码块，从而提高了程序性能。
 * 不过还需要考虑一种情况，假如两个线程A、B，A执行了if (instance == null)语句，它会认为单例对象没有创建，
 * 此时线程切到B也执行了同样的语句，B也认为单例对象没有创建，然后两个线程依次执行同步代码块，并分别创建了一个单例对象。
 * 为了解决这个问题，还需要在同步代码块中增加if (instance == null)语句，也就是下面的代码2
 * <p>
 * Java中的指令重排优化。所谓指令重排优化是指在不改变原语义的情况下，通过调整指令的执行顺序让程序运行的更快。
 * JVM中并没有规定编译器优化相关的内容，也就是说JVM可以自由的进行指令重排序的优化。
 * 由于指令重排优化的存在，导致初始化Singleton和将对象地址赋给instance字段的顺序是不确定的。
 * 在某个线程创建单例对象时，在构造方法被调用之前，就为该对象分配了内存空间并将对象的字段设置为默认值。
 * 此时就可以将分配的内存地址赋值给instance字段了，然而该对象可能还没有初始化。
 * 若紧接着另外一个线程来调用getInstance，取到的就是状态不正确的对象，程序就会出错
 * 在JDK1.5及之后版本增加了volatile关键字。
 * volatile的一个语义是禁止指令重排序优化，也就保证了instance变量被赋值的时候对象已经是初始化过的，从而避免了上面说到的问题
 */
public class SingletonDoubleLock {

    private static volatile SingletonDoubleLock instance = null;

    private SingletonDoubleLock() {
    }

    public static SingletonDoubleLock getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleLock.class) {
                if (instance == null) {     //2
                    instance = new SingletonDoubleLock();
                }
            }
        }
        return instance;
    }
}
