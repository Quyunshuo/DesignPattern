package com.quyunshuo.designpattern.structural.decorator.io

import java.io.*

/**
 * 装饰者模式 Java I/O 自定义LowerCaseInputStream-测试
 */
fun main() {
    var read: Int
    try {
        val inputStream: InputStream =
            LowerCaseInputStream(BufferedInputStream(FileInputStream("/Users/quyunshuo/Projects/IdeaProjects/DesignPattern/src/com/quyunshuo/designpattern/structural/decorator/io/test.txt")))
        while (inputStream.read().also { read = it } != -1) {
            print(read.toChar())
        }
        inputStream.close()
    } catch (e: IOException) {
        e.printStackTrace()
    }
    // 输出结果
    // i know the decorator pattern therefore i rule!
}