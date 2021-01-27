package com.quyunshuo.designpattern.structural.adapter.iterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 在Java中早期的集合类型，都实现了一个名为 elements() 的方法，该方法会返回一个 Enumeration （枚举）类
 * 这个 Enumeration 接口可以逐一走过此集合的元素，而无需知道它们在集合中是如何被管理的
 * 当 sun 推出更新后的集合类时，开始使用了 Iterator （迭代器），这个接口和枚举接口很像，都可以让你遍历此集合类型内的每个元素
 * 但不同的是，迭代器还提供了删除元素的能力
 * 而今天...我们经常面对遗留代码，这些代码暴露出枚举器接口，但我们又希望在新的代码中只使用迭代器。如是我们就写了一个适配器来转换
 */
public class EnumerationIterator<E> implements Iterator<E> {

    private final Enumeration<E> enumeration;

    public EnumerationIterator(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }

    /**
     * 很不幸，我们不能支持迭代器的remove()方法，所以必须放弃。在这里，我们的做法是抛出一个异常
     */
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}