package com.joker.demo.decorator.customize;

import com.joker.demo.decorator.customize.*;

/**
 * @version 1.0.0
 * @ClassName CoffeBar.java
 * @Package com.joker.demo.decorator
 * @Author Joker
 * @Description 测试类
 * @CreateTime 2021年07月20日 09:54:00
 */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink drink;
        drink = new Decaf();
        System.out.println("order1 price:" + drink.cost());
        System.out.println("order1 description:" + drink.getDescription());
        System.out.println("*********************************************************");
        drink = new Espresso();
        drink = new Milk(drink);
        drink = new Chocolate(drink);
        System.out.println("order2 price:" + drink.cost());
        System.out.println("order2 description:" + drink.getDescription());
        System.out.println("*********************************************************");


    }

}
