package com.joker.demo.strategy.flybehavior;

/**
 * @version 1.0.0
 * @ClassName GoodFly.java
 * @Package com.joker.demo.strategy
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月19日 10:48:00
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("---GoodFly---");
    }
}
