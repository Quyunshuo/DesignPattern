package com.quyunshuo.designpattern.behavioral.command

fun main() {
//    testSimpleRemoteControl()
//    testRemoteControl()
//    testRemoteControlUndo()
    testMacroCommand()
}

/**
 * 测试简单遥控器
 */
fun testSimpleRemoteControl() {
    // 遥控器就是调用者，会传入一个命令对象，可以用来发出请求
    val control = SimpleRemoteControl()
    // 创建一个电灯💡对象，此对象也是请求的接收者
    val light = Light()
    // 创建一个命令，将接收者传给它
    val lightOnCommand = LightOnCommand(light)

    // 设置插槽的命令
    control.setCommand(lightOnCommand)
    // 按下按钮
    control.buttonWasPressed()
    // 输出结果
    // on
}

/**
 * 测试有七个插槽的遥控器
 */
fun testRemoteControl() {
    val light = Light()
    val stereo = Stereo()

    val lightOnCommand = LightOnCommand(light)
    val lightOffCommand = LightOffCommand(light)

    val stereoOnWithCDCommand = StereoOnWithCDCommand(stereo)
    val stereoOffCommand = StereoOffCommand(stereo)

    val remoteControl = RemoteControl()
    remoteControl.setCommand(0, lightOnCommand, lightOffCommand)
    remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffCommand)

    println(remoteControl.toString())

    remoteControl.onButtonWasPushed(0)
    remoteControl.onButtonWasPushed(1)

    remoteControl.offButtonWasPushed(0)
    remoteControl.offButtonWasPushed(1)
    // 输出结果
    // ------ Remote Control ------
    // [slot:0 on:LightOnCommand off:LightOffCommand]
    // [slot:1 on:StereoOnWithCDCommand off:StereoOffCommand]
    // [slot:2 on:NoCommand off:NoCommand]
    // [slot:3 on:NoCommand off:NoCommand]
    // [slot:4 on:NoCommand off:NoCommand]
    // [slot:5 on:NoCommand off:NoCommand]
    // [slot:6 on:NoCommand off:NoCommand]
    //
    // ----------- End -----------
    //
    //  Light -> on
    //  Stereo -> on
    //  Stereo -> set CD
    //  Stereo -> set volume 11
    //  Light -> off
    //  Stereo -> off
}

/**
 * 测试有七个插槽的遥控器的撤销功能
 */
fun testRemoteControlUndo() {
    val remoteControl = RemoteControl()
    val ceilingFan = CeilingFan("Living Room")

    // 创建吊扇的四个档位命令
    val offCommand = CeilingFanOffCommand(ceilingFan)
    val lowCommand = CeilingFanLowCommand(ceilingFan)
    val mediumCommand = CeilingFanMediumCommand(ceilingFan)
    val highCommand = CeilingFanHighCommand(ceilingFan)

    remoteControl.setCommand(0, lowCommand, offCommand)
    remoteControl.setCommand(1, mediumCommand, offCommand)
    remoteControl.setCommand(2, highCommand, offCommand)

    println(remoteControl.toString())

    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)
    remoteControl.undoButtonWasPushed()

    remoteControl.onButtonWasPushed(2)
    remoteControl.offButtonWasPushed(2)
    remoteControl.undoButtonWasPushed()

    // 输出结果
    // ------ Remote Control ------
    // [slot:0 on:CeilingFanLowCommand off:CeilingOffCommand]
    // [slot:1 on:CeilingFanMediumCommand off:CeilingOffCommand]
    // [slot:2 on:CeilingFanHighCommand off:CeilingOffCommand]
    // [slot:3 on:NoCommand off:NoCommand]
    // [slot:4 on:NoCommand off:NoCommand]
    // [slot:5 on:NoCommand off:NoCommand]
    // [slot:6 on:NoCommand off:NoCommand]
    //
    // ----------- End -----------
    //
    //  CeilingFan - LOW
    //  CeilingFan - OFF
    //  CeilingFan - LOW
    //  CeilingFan - HIGH
    //  CeilingFan - OFF
    //  CeilingFan - HIGH
}

/**
 * 测试宏命令
 */
fun testMacroCommand() {
    val remoteControl = RemoteControl()

    val light = Light()
    val stereo = Stereo()
    val ceilingFan = CeilingFan("")

    // 一组打开的命令
    val onCommands = mutableListOf<Command>()
    onCommands.add(LightOnCommand(light))
    onCommands.add(StereoOnWithCDCommand(stereo))
    onCommands.add(CeilingFanHighCommand(ceilingFan))

    // 一组关闭的命令
    val offCommands = mutableListOf<Command>()
    offCommands.add(LightOffCommand(light))
    offCommands.add(StereoOffCommand(stereo))
    offCommands.add(CeilingFanOffCommand(ceilingFan))

    val onMacroCommand = MacroCommand(onCommands)
    val offMacroCommand = MacroCommand(offCommands)

    remoteControl.setCommand(0, onMacroCommand, offMacroCommand)

    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)
    // 输出结果
    // Light -> on
    // Stereo -> on
    // Stereo -> set CD
    // Stereo -> set volume 11
    // CeilingFan - HIGH
    // Light -> off
    // Stereo -> off
    // CeilingFan - OFF
}