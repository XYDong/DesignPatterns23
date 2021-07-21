package com.joker.demo.adapter;

/**
 * @version 1.0.0
 * @ClassName TurkeyAdapter.java
 * @Package com.joker.demo.adapter
 * @Author Joker
 * @Description 对象适配器（需要传一个对象进来）
 * @CreateTime 2021年07月21日 15:42:00
 */
public class TurkeyAdapter implements Duck{
    private final Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
