package com.joker.demo.factory.abstractfactory;


/**
 * @version 1.0.0
 * @ClassName LDCheesePizza.java
 * @Package com.joker.demo.factory.simple
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 15:52:00
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setpName("LDCheesePizza");
        System.out.println(getpName()+" preparing;");
    }
}
