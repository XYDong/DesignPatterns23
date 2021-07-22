package com.joker.demo.templatemode;

/**
 * @version 1.0.0
 * @ClassName HotDrinkTemplate.java
 * @Package com.joker.demo.templatemode
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月22日 14:19:00
 */
public abstract class HotDrinkTemplate {
    public final void prepareRecipe(){
        boilWater();
        brew();
        popurInCup();
        if (hook()) {
            addCondiments();
        }else {
            System.out.println("no add");
        }
    }

    private void boilWater() {
        System.out.println("boilWater");
    }

    protected abstract void brew();

    private void popurInCup() {
        System.out.println("popurInCup");
    }

    protected abstract void addCondiments();

    public boolean hook(){
        return true;
    }

}
