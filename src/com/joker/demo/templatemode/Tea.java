package com.joker.demo.templatemode;

/**
 * @version 1.0.0
 * @ClassName Tea.java
 * @Package com.joker.demo.templatemode
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月22日 14:27:00
 */
public class Tea extends HotDrinkTemplate{
    @Override
    protected void brew() {
        System.out.println("brew tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("add lemon");
    }
}
