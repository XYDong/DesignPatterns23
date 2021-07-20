package com.joker.demo.strategy.quackbehavior;

/**
 * @version 1.0.0
 * @ClassName GaGaQuackBehavior.java
 * @Package com.joker.demo.strategy.quackbehavior
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月19日 10:51:00
 */
public class GaGaQuackBehavior implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("---GaGaQuackBehavior---");
    }
}
