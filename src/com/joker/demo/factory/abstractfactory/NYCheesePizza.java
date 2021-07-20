package com.joker.demo.factory.abstractfactory;


/**
 * @version 1.0.0
 * @ClassName NYCheesePizza.java
 * @Package com.joker.demo.factory.simple
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 15:51:00
 */
public class NYCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setpName("NYCheesePizza");
        System.out.println(getpName()+" preparing;");
    }
}
