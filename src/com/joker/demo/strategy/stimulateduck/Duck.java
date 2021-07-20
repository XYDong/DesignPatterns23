package com.joker.demo.strategy.stimulateduck;

import com.joker.demo.strategy.flybehavior.FlyBehavior;
import com.joker.demo.strategy.quackbehavior.QuackBehavior;

/**
 * @version 1.0.0
 * @ClassName Duck.java
 * @Package com.joker.demo.strategy.stimulateduck
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月19日 10:54:00
 */
public abstract class Duck {
    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public Duck() {
    }

    public void fly() {
        mFlyBehavior.fly();
    }
    public void quack(){
        mQuackBehavior.quack();
    }
    public abstract void display();

    public void setFlyBehavior(FlyBehavior mFlyBehavior) {
        this.mFlyBehavior = mFlyBehavior;
    }

    public void setQuackBehavior(QuackBehavior mQuackBehavior) {
        this.mQuackBehavior = mQuackBehavior;
    }

    public void swim(){
        System.out.println("---swim---");
    }
}
