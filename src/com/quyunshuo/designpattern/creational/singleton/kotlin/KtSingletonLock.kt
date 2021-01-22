package com.quyunshuo.designpattern.creational.singleton.kotlin

/**
 * 线程安全的懒汉式
 */
class KtSingletonLock {

    companion object {

        private var instance: KtSingletonLock? = null
            get() {
                if (field == null) field = KtSingletonLock()
                return field
            }

        @Synchronized
        fun instance(): KtSingletonLock {
            return instance!!
        }
    }
}