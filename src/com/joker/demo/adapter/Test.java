package com.joker.demo.adapter;

/**
 * @version 1.0.0
 * @ClassName Test.java
 * @Package com.joker.demo.adapter
 * @Author Joker
 * @Description Test
 * @CreateTime 2021年07月21日 15:00:00
 */
public class Test {
    public static void main(String[] args) {
        Duck duck = new TurkeyAdapter(new WildTurkey());
        duck.quack();
        duck.fly();
        System.out.println("------------------------------------------");
        Duck duck1 = new TurkeyAdapter2();
        duck1.quack();
        duck1.fly();
    }
}
