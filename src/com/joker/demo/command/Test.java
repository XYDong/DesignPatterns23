package com.joker.demo.command;

import com.joker.demo.command.device.Light;

/**
 * @version 1.0.0
 * @ClassName Test.java
 * @Package com.joker.demo.construction
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月21日 11:00:00
 */
public class Test {
    public static void main(String[] args) {
        Light bedroom = new Light("bedroom");
        LightOnCommand lightOnCommand = new LightOnCommand(bedroom);
        LightOffCommand lightOffCommand = new LightOffCommand(bedroom);
        CommandControl commandControl = new CommandControl();
        commandControl.setCommand(0,lightOnCommand,lightOffCommand);
        commandControl.offButton(0);
        commandControl.onButton(1);
    }
}
