package com.quyunshuo.designpattern.behavioral.command

/**
 * 关闭音响命令
 * @property stereo Stereo
 * @constructor
 */
class StereoOffCommand(private val stereo: Stereo) : Command {

    override fun execute() {
        stereo.off()
    }

    override fun undo() {
        stereo.on()
    }
}