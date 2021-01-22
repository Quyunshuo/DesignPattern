package com.quyunshuo.designpattern.creational.singleton.kotlin

/**
 * 静态内部类式
 */
class KtSingletonStaticClass {
    companion object {
        val instance = SingletonHolder.holder
    }

    private object SingletonHolder {
        val holder = KtSingletonStaticClass()
    }
}