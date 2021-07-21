package com.joker.demo.command;

/**
 * @version 1.0.0
 * @ClassName Control.java
 * @Package com.joker.demo.command
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月21日 14:18:00
 */
public interface Control {
    void onButton(int slot);
    void offButton(int slot);
}
