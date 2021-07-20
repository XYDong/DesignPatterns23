package com.joker.demo.factory.abstractfactory;

/**
 * @version 1.0.0
 * @ClassName LDFactory.java
 * @Package com.joker.demo.factory.abstractfactory
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 15:56:00
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new LDCheesePizza();
            case "pepper":
                return new LDPepperPizza();
            default: return null;
        }
    }
}
