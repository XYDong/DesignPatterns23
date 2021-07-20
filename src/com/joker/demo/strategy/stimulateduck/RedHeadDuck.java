package com.joker.demo.strategy.stimulateduck;

import com.joker.demo.strategy.flybehavior.BadFlyBehavior;
import com.joker.demo.strategy.quackbehavior.GeGeQuackBehavior;

/**
 * @version 1.0.0
 * @ClassName RedHeadDuck.java
 * @Package com.joker.demo.strategy.stimulateduck
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月19日 11:00:00
 */
public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        mFlyBehavior = new BadFlyBehavior();
        mQuackBehavior = new GeGeQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("**RedHeadDuck**");
    }
}
