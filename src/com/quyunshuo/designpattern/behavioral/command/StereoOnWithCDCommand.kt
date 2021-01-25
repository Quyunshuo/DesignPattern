package com.quyunshuo.designpattern.behavioral.command

/**
 * 打开音响
 */
class StereoOnWithCDCommand(private val stereo: Stereo) : Command {

    override fun execute() {
        stereo.on()
        stereo.setCD()
        stereo.setVolume(11)
    }

    override fun undo() {
        stereo.off()
    }
}