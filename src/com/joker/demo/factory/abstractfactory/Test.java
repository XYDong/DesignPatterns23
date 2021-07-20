package com.joker.demo.factory.abstractfactory;

/**
 * @version 1.0.0
 * @ClassName Test.java
 * @Package com.joker.demo.factory.abstractfactory
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 15:57:00
 */
public class Test {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new NYFactory());
    }
}
