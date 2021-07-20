package com.joker.demo.factory.method;

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
public abstract class OrderPizza {
    public SimplePizzaFactory factory;
    public String name;

    public void setFactory() {
        do {
            String type = getType();
            Pizza pizza = createPizza(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }

    protected abstract Pizza createPizza(String type);

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
