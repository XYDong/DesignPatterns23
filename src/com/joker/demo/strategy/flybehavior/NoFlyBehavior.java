package com.joker.demo.strategy.flybehavior;

/**
 * @version 1.0.0
 * @ClassName NoFlyBehavior.java
 * @Package com.joker.demo.strategy
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月19日 10:49:00
 */
public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("---NoFly---");
    }
}
