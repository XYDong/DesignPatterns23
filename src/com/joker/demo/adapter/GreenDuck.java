package com.joker.demo.adapter;

/**
 * @version 1.0.0
 * @ClassName GreenDuck.java
 * @Package com.joker.demo.adapter
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月21日 15:41:00
 */
public class GreenDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("ga ga");
    }

    @Override
    public void fly() {
        System.out.println("GreenDuck fly");
    }
}
