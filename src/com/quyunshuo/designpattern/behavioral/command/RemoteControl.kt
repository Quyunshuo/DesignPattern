package com.quyunshuo.designpattern.behavioral.command

/**
 * 遥控器 拥有7个插槽的遥控器
 * 插槽的初始化使用了空对象模式
 */
class RemoteControl {

    private val onCommands =
        mutableListOf<Command>(
            NoCommand(),
            NoCommand(),
            NoCommand(),
            NoCommand(),
            NoCommand(),
            NoCommand(),
            NoCommand()
        )

    private val offCommands =
        mutableListOf<Command>(
            NoCommand(),
            NoCommand(),
            NoCommand(),
            NoCommand(),
            NoCommand(),
            NoCommand(),
            NoCommand()
        )

    /**
     * 引用每一次的命令 用于撤销
     */
    private var undoCommand: Command = NoCommand()

    /**
     * 设置插槽的命令
     * @param slot Int 插槽位置
     * @param onCommand Command 开命令
     * @param offCommand Command 关命令
     */
    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    /**
     * 按下开按钮
     * @param slot Int 插槽位置
     */
    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    /**
     * 按下关按钮
     * @param slot Int 插槽位置
     */
    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    /**
     * 按下撤销按钮
     */
    fun undoButtonWasPushed() {
        undoCommand.undo()
    }

    override fun toString(): String {
        val sb = StringBuffer()
        sb.append("\n------ Remote Control ------\n")
        (0 until onCommands.size).forEach {
            sb.append("[slot:$it on:${onCommands[it].javaClass.simpleName} off:${offCommands[it].javaClass.simpleName}]\n")
        }
        sb.append("\n----------- End -----------\n")
        return sb.toString()
    }
}