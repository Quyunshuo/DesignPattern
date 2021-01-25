package com.quyunshuo.designpattern.behavioral.command

/**
 * 一个只有一个按钮和对应插槽的遥控器
 */
class SimpleRemoteControl {

    /**
     * 有一个插槽持有命令，而这个命令控制着一个装置
     */
    private var slot: Command? = null

    /**
     * 这个方法用来设置插槽控制的命令。如果这段代码的客户想要改变遥控器按钮的行为，可以多次调用这个方法
     */
    fun setCommand(command: Command) {
        slot = command
    }

    /**
     * 当按下按钮时，这个方法就会被调用，使得当前命令衔接插槽，并调用它的execute()方法
     */
    fun buttonWasPressed() {
        slot?.execute()
    }
}