package com.quyunshuo.designpattern.creational.builder.classic

/**
 * Builder接口的具体实现
 */
class ConcreteBuilderA : Builder {

    private lateinit var product: Product

    override fun buildPartOne() {}

    override fun buildPartTwo() {}

    override fun getProduct(): Product {
        return product
    }
}