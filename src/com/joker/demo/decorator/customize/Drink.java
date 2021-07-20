package com.joker.demo.decorator.customize;/**
 * @ClassName Drink.java
 * @Package com.joker.demo.decorator
 * @Author Joker
 * @version 1.0.0
 * @Description 超类
 * @CreateTime 2021年07月20日 09:39:00
 */public abstract class Drink {
     public String description = "";
     private float price = 0f;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description+"-"+getPrice();
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    public abstract float cost();
}
