package com.joker.demo.adapter;

/**
 * @version 1.0.0
 * @ClassName WildTurkey.java
 * @Package com.joker.demo.adapter
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月21日 15:41:00
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("go go");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey fly");
    }
}
