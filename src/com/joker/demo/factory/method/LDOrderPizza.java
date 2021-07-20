package com.joker.demo.factory.method;

/**
 * @version 1.0.0
 * @ClassName LDOrderPizza.java
 * @Package com.joker.demo.factory.method
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 15:25:00
 */
public class LDOrderPizza extends OrderPizza{

    public LDOrderPizza(SimplePizzaFactory factory) {
        super.factory = factory;
    }

    @Override
    protected Pizza createPizza(String type) {
        return factory.createPizza(type);
    }
}
