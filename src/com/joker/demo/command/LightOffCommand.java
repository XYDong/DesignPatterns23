package com.joker.demo.command;

import com.joker.demo.command.device.Light;

/**
 * @version 1.0.0
 * @ClassName LightOffCommand.java
 * @Package com.joker.demo.command
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月21日 14:32:00
 */
public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void excute() {
        light.off();
    }

    @Override
    public void undo() {

    }
}
