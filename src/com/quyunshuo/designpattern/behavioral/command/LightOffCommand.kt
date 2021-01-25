package com.quyunshuo.designpattern.behavioral.command

/**
 * 关闭电灯的命令
 * 构造方法中需要传入某一个电灯💡以便让这个命令进行控制
 */
class LightOffCommand(private val light: Light) : Command {

    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}