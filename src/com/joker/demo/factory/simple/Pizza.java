package com.joker.demo.factory.simple;

/**
 * @version 1.0.0
 * @ClassName Pizza.java
 * @Package com.joker.demo.factory
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 14:37:00
 */
public abstract class Pizza {
    private String pName ="";

    public void bake() {
        System.out.println(pName + "baking;");
    }
    public void cut() {
        System.out.println(pName + "cuting;");
    }
    public void box() {
        System.out.println(pName + "boxing;");
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public abstract void prepare();
}
