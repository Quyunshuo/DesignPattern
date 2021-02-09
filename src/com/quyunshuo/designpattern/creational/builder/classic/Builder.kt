package com.quyunshuo.designpattern.creational.builder.classic

/**
 * 抽象接口
 */
interface Builder {

    fun buildPartOne()

    fun buildPartTwo()

    fun getProduct(): Product
}