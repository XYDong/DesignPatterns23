package com.joker.demo.factory.abstractfactory;

import com.joker.demo.factory.simple.PepperPizza;

/**
 * @version 1.0.0
 * @ClassName NYFactory.java
 * @Package com.joker.demo.factory.abstractfactory
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 15:50:00
 */
public class NYFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYCheesePizza();
            case "pepper":
                return new NYPepperPizza();
            default: return null;
        }
    }
}
