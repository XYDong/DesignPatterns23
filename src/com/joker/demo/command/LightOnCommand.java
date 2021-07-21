package com.joker.demo.command;

import com.joker.demo.command.device.Light;

/**
 * @version 1.0.0
 * @ClassName LightOnCommand.java
 * @Package com.joker.demo.command
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月21日 14:09:00
 */
public class LightOnCommand implements Command{

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
