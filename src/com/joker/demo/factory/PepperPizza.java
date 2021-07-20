package com.joker.demo.factory;

/**
 * @version 1.0.0
 * @ClassName PepperPizza.java
 * @Package com.joker.demo.factory
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 14:50:00
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        super.setpName("PepperPizza");
        System.out.println(getpName()+" preparing;");
    }
}
