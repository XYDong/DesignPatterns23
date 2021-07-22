package com.joker.demo.templatemode;

/**
 * @version 1.0.0
 * @ClassName Test.java
 * @Package com.joker.demo.templatemode
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月22日 14:31:00
 */
public class Test {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
