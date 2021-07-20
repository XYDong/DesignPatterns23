package com.joker.demo.decorator.customize;

/**
 * @version 1.0.0
 * @ClassName Chocolate.java
 * @Package com.joker.demo.decorator
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 09:51:00
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        super.setDescription("Chocolate");
        super.setPrice(3.0f);
    }
}
