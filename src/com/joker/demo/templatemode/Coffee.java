package com.joker.demo.templatemode;

/**
 * @version 1.0.0
 * @ClassName Coffee.java
 * @Package com.joker.demo.templatemode
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月22日 14:18:00
 */
public class Coffee extends HotDrinkTemplate{
    @Override
    protected void brew() {
        System.out.println("brew coffee");
    }

    @Override
    protected void addCondiments() {
        System.out.println("add sugar and milk ");
    }
}
