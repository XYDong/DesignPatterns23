package com.joker.demo.strategy;

import com.joker.demo.strategy.quackbehavior.NoQuackBehavior;
import com.joker.demo.strategy.stimulateduck.Duck;
import com.joker.demo.strategy.stimulateduck.GreenHeadDuck;
import com.joker.demo.strategy.stimulateduck.RedHeadDuck;

/**
 * @version 1.0.0
 * @ClassName StimulateDuck.java
 * @Package com.joker.demo.strategy
 * @Author Joker
 * @Description 策略模式
 * @CreateTime 2021年07月19日 11:02:00
 */
public class StimulateDuck {
    public static void main(String[] args) {
        Duck greenHeadDuck = new GreenHeadDuck();
        Duck redHeadDuck = new RedHeadDuck();
        greenHeadDuck.display();
        greenHeadDuck.fly();
        greenHeadDuck.quack();
        greenHeadDuck.swim();

        redHeadDuck.display();
        redHeadDuck.fly();
        redHeadDuck.quack();
        redHeadDuck.swim();

        greenHeadDuck.setQuackBehavior(new NoQuackBehavior());
        greenHeadDuck.quack();
        greenHeadDuck.swim();
    }
}
