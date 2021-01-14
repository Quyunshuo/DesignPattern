package com.quyunshuo.designpattern.structural.decorator.io

import java.io.FilterInputStream
import java.io.InputStream

/**
 * 利用Java I/O 典型的装饰者模式
 * 新的输入装饰者 把输入流中的所有大写字符转成小写
 *
 * 首先扩展[java.io.FilterInputStream]，这是所有InputStream的抽象装饰者
 */
class LowerCaseInputStream(input: InputStream) : FilterInputStream(input) {

    override fun read(): Int {
        val read = super.read()
        // 将字符转为大写
        return if (read == -1) read else Character.toLowerCase(read.toChar()).toInt()
    }

    override fun read(b: ByteArray, off: Int, len: Int): Int {
        val read = super.read(b, off, len)
        (off until off + read).forEach {
            b[it] = Character.toLowerCase(read.toChar()).toByte()
        }
        return read
    }
}