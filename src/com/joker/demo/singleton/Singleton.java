package com.joker.demo.singleton;

/**
 * @version 1.0.0
 * @ClassName Singleton.java
 * @Package com.joker.demo.singleton
 * @Author Joker
 * @Description 单例
 * @CreateTime 2021年07月20日 13:47:00
 */
public class Singleton {
    private static volatile Singleton uniqeInstance = null;
    private Singleton(){

    }
    public static Singleton getInstance(){
        synchronized (Singleton.class){
            if (uniqeInstance == null) {
                uniqeInstance = new Singleton();
            }
        }
        return uniqeInstance;
    }

}
