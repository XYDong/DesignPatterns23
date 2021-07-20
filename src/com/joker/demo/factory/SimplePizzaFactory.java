package com.joker.demo.factory;

/**
 * @version 1.0.0
 * @ClassName SimpleFactory.java
 * @Package com.joker.demo.factory
 * @Author Joker
 * @Description 简单工厂名模式
 * @CreateTime 2021年07月20日 14:36:00
 */
public class SimplePizzaFactory {
    private static volatile SimplePizzaFactory instance = null;

    public static SimplePizzaFactory getInstance() {
        synchronized (SimplePizzaFactory.class){
            if (instance == null) {
                synchronized (SimplePizzaFactory.class){
                    instance = new SimplePizzaFactory();
                }
            }
        }
        return instance;
    }

    private SimplePizzaFactory() {
    }
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        switch (orderType) {
            case "cheese":
                return new CheesePizza();
            case "pepper":
                return new PepperPizza();
            default: return null;
        }
    }
}
