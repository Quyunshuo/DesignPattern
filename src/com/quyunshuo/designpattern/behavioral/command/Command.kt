package com.quyunshuo.designpattern.behavioral.command

/**
 * 命令接口
 */
interface Command {

    /**
     * 执行
     */
    fun execute()

    /**
     * 撤销
     */
    fun undo()
}