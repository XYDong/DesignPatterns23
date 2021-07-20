package com.joker.demo.factory;

/**
 * @version 1.0.0
 * @ClassName test.java
 * @Package com.joker.demo.factory
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 14:32:00
 */
public class Test {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(SimplePizzaFactory.getInstance());
    }
}
