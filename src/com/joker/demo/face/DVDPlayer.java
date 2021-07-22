package com.joker.demo.face;

/**
 * @version 1.0.0
 * @ClassName DVDPlayer.java
 * @Package com.joker.demo.face
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月22日 10:21:00
 */
public class DVDPlayer {
    public static DVDPlayer instance = null;

    private DVDPlayer() {
    }

    public static DVDPlayer getInstance() {
        synchronized (DVDPlayer.class){
            if (instance == null) {
                instance = new DVDPlayer();
            }
        }
        return instance;
    }

    public void on(){
        System.out.println("DVDPlayer on");
    }
    public void off(){
        System.out.println("DVDPlayer off");
    }
    public void play(){
        System.out.println("DVDPlayer play");
    }
    public void setDVD(){
        System.out.println("DVDPlayer setDvd");
    }
}
