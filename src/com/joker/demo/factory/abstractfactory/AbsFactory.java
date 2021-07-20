package com.joker.demo.factory.abstractfactory;


/**
 * @version 1.0.0
 * @ClassName AbsFactory.java
 * @Package com.joker.demo.factory.abstractfactory
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 15:47:00
 */
public interface AbsFactory {
    Pizza createPizza(String type);
}
