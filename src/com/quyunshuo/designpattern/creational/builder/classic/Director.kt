package com.quyunshuo.designpattern.creational.builder.classic

/**
 * Builder接口的构造者和使用者
 */
class Director(private val builder: Builder) {

    fun buildProduct() {
        builder.buildPartOne()
        builder.buildPartTwo()
    }

    fun getProduct(): Product {
        return builder.getProduct()
    }
}