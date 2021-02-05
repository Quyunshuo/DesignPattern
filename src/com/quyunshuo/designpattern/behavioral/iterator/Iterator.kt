package com.quyunshuo.designpattern.behavioral.iterator

/**
 * 一个迭代器接口大概会是这样的 或许使用Java提供的迭代器[java.util.Iterator]会更好
 */
interface Iterator {

    /**
     * 该方法会返回一个布尔值，表示是否还有下一个元素
     */
    fun hasNext(): Boolean

    /**
     * 该方法会返回下一个元素
     */
    fun next(): Any
}