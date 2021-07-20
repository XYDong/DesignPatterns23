package com.joker.demo.decorator.customize;

/**
 * @version 1.0.0
 * @ClassName Coffee.java
 * @Package com.joker.demo.decorator
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 09:42:00
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
