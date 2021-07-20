package com.joker.demo.decorator.customize;

/**
 * @version 1.0.0
 * @ClassName Milk.java
 * @Package com.joker.demo.decorator
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 09:52:00
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        super.setDescription("Milk");
        super.setPrice(3.0f);
    }
}
