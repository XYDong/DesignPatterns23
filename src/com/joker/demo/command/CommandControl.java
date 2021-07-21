package com.joker.demo.command;

/**
 * @version 1.0.0
 * @ClassName CommandControl.java
 * @Package com.joker.demo.command
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月21日 14:21:00
 */
public class CommandControl implements Control {
        private Command[] onCommands;
        private Command[] offCommands;

    public CommandControl() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        Command noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;

    }

    @Override
    public void onButton(int slot) {
        onCommands[slot].excute();
    }

    @Override
    public void offButton(int slot) {
        offCommands[slot].excute();
    }
}
