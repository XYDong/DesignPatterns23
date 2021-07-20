package com.joker.demo.factory.abstractfactory;

/**
 * @version 1.0.0
 * @ClassName NYPepperPizza.java
 * @Package com.joker.demo.factory.abstractfactory
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 15:55:00
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        super.setpName("LDPepperPizza");
        System.out.println(getpName()+" preparing;");
    }
}
