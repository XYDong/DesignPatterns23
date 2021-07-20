package com.joker.demo.strategy.quackbehavior;

/**
 * @version 1.0.0
 * @ClassName NoQuackBehavior.java
 * @Package com.joker.demo.strategy.quackbehavior
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月19日 10:53:00
 */
public class NoQuackBehavior implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("---NoQuackBehavior---");
    }
}
