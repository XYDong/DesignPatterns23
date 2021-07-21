package com.joker.demo.command.device;

/**
 * @version 1.0.0
 * @ClassName Light.java
 * @Package com.joker.demo.construction.device
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月21日 13:46:00
 */
public class Light {
    String loc ="";

    public Light(String loc) {
        this.loc = loc;
    }

    public void on(){
        System.out.println(loc + " on");
    }

    public void off(){
        System.out.println(loc + " off");
    }

}
