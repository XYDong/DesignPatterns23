package com.joker.demo.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @version 1.0.0
 * @ClassName orderPizza.java
 * @Package com.joker.demo.factory
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 14:51:00
 */
public class OrderPizza {
    SimplePizzaFactory factory;

    public OrderPizza(SimplePizzaFactory factory) {
        setFactory(factory);
    }

    public void setFactory(SimplePizzaFactory factory) {
        do {
            String type = getType();
            Pizza pizza = factory.createPizza(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }

    private String getType(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
