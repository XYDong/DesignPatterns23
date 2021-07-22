package com.joker.demo.face;

/**
 * @version 1.0.0
 * @ClassName Popcorn.java
 * @Package com.joker.demo.face
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月22日 10:18:00
 */
public class Popcorn {
    private static Popcorn instance = null;

    private Popcorn() {
    }

    public static Popcorn getInstance() {
        synchronized (Popcorn.class){
            if (instance == null) {
                instance = new Popcorn();
            }
        }
        return instance;
    }
    public void on(){
        System.out.println("Popcorn on");
    }
    public void off(){
        System.out.println("Popcorn off");
    }
    public void pop(){
        System.out.println("Popcorn starting");
    }
}
