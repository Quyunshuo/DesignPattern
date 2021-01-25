package com.quyunshuo.designpattern.behavioral.command

/**
 * 宏命令
 * 用于执行一系列的命令
 */
class MacroCommand(private val commands: List<Command>) : Command {

    override fun execute() {
        commands.forEach { it.execute() }
    }

    override fun undo() {}
}