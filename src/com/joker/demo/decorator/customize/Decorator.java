package com.joker.demo.decorator.customize;

/**
 * @version 1.0.0
 * @ClassName Decorator.java
 * @Package com.joker.demo.decorator
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 09:46:00
 */
public class Decorator extends Drink{
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return getPrice() + drink.getPrice();
    }

    @Override
    public String getDescription() {
        return super.description+"-"+super.getPrice()+"&&"+drink.getDescription();
    }
}
