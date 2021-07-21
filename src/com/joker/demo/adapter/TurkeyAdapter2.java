package com.joker.demo.adapter;

/**
 * @version 1.0.0
 * @ClassName TurkeyAdapter2.java
 * @Package com.joker.demo.adapter
 * @Author Joker
 * @Description 类适配器（多继承）
 * @CreateTime 2021年07月21日 15:44:00
 */
public class TurkeyAdapter2 extends WildTurkey implements Duck{
    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fly();
        super.fly();
        super.fly();
        super.fly();
    }
}
