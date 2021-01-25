package com.quyunshuo.designpattern.behavioral.command

/**
 * 没有命令
 * 空对象模式
 */
class NoCommand : Command {

    override fun execute() {
        println(" no command ")
    }

    override fun undo() {
        println(" no command ")
    }
}