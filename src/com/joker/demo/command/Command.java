package com.joker.demo.command;

/**
 * @version 1.0.0
 * @ClassName Command.java
 * @Package com.joker.demo.command
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月21日 14:08:00
 */
public interface Command {
    void excute();
    void undo();
}
