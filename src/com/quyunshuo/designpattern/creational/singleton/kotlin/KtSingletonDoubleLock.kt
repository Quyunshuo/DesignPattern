package com.quyunshuo.designpattern.creational.singleton.kotlin

/**
 * 双重校验锁式
 * Lazy是接受一个 lambda 并返回一个 Lazy 实例的函数，返回的实例可以作为实现延迟属性的委托
 * 第一次调用 get() 会执行已传递给 lazy() 的 lambda 表达式并记录结果,后续调用 get() 只是返回记录的结果
 * Lazy默认的线程模式就是 LazyThreadSafetyMode.SYNCHRONIZED 内部默认双重校验锁
 * # Lazy内部实现
 * ```
 * public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> T): Lazy<T> =
 *      when (mode) {
 *        LazyThreadSafetyMode.SYNCHRONIZED -> SynchronizedLazyImpl(initializer)
 *        LazyThreadSafetyMode.PUBLICATION -> SafePublicationLazyImpl(initializer)
 *        LazyThreadSafetyMode.NONE -> UnsafeLazyImpl(initializer)
 *      }
 * ```
 * ### Lazy接口
 * ```
 * public interface Lazy<out T> {
 *     //当前实例化对象，一旦实例化后，该对象不会再改变
 *     public val value: T
 *     //返回true表示，已经延迟实例化过了，false 表示，没有被实例化，
 *     //一旦方法返回true，该方法会一直返回true,且不会再继续实例化
 *     public fun isInitialized(): Boolean
 * }
 * ```
 * ### SynchronizedLazyImpl
 * ```
 * private class SynchronizedLazyImpl<out T>(initializer: () -> T, lock: Any? = null) : Lazy<T>, Serializable {
 *     private var initializer: (() -> T)? = initializer
 *     @Volatile private var _value: Any? = UNINITIALIZED_VALUE
 *     // final field is required to enable safe publication of constructed instance
 *     private val lock = lock ?: this
 *
 *     override val value: T
 *         get() {
 *             val _v1 = _value
 *             //判断是否已经初始化过，如果初始化过直接返回，不在调用高级函数内部逻辑
 *             if (_v1 !== UNINITIALIZED_VALUE) {
 *                 @Suppress("UNCHECKED_CAST")
 *                 return _v1 as T
 *             }
 *
 *             return synchronized(lock) {
 *                 val _v2 = _value
 *                 if (_v2 !== UNINITIALIZED_VALUE) {
 *                     @Suppress("UNCHECKED_CAST") (_v2 as T)
 *                 }
 *                 else {
 *                     //调用高级函数获取其返回值
 *                     val typedValue = initializer!!()
 *                     //将返回值赋值给_value,用于下次判断时，直接返回高级函数的返回值
 *                     _value = typedValue
 *                     initializer = null
 *                     typedValue
 *                 }
 *             }
 *         }
 *         //省略部分代码
 * }
 * ```
 */
class KtSingletonDoubleLock private constructor() {

    companion object {
        val instance by lazy { KtSingletonDoubleLock() }
    }
}