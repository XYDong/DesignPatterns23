package com.joker.demo.factory.simple;

/**
 * @version 1.0.0
 * @ClassName CheesePizza.java
 * @Package com.joker.demo.factory
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 14:46:00
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        super.setpName("CheesePizza");
        System.out.println(getpName()+" preparing;");
    }
}
