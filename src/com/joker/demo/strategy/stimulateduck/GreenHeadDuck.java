package com.joker.demo.strategy.stimulateduck;

import com.joker.demo.strategy.flybehavior.GoodFlyBehavior;
import com.joker.demo.strategy.quackbehavior.GaGaQuackBehavior;

/**
 * @version 1.0.0
 * @ClassName GreenHeadDuck.java
 * @Package com.joker.demo.strategy.stimulateduck
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月19日 10:59:00
 */
public class GreenHeadDuck extends Duck{
    public GreenHeadDuck() {
        mFlyBehavior = new GoodFlyBehavior();
        mQuackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("**GreenHeadDuck**");
    }
}
