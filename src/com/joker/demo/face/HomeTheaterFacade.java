package com.joker.demo.face;

/**
 * @version 1.0.0
 * @ClassName HomeTheaterFacade.java
 * @Package com.joker.demo.face
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月22日 10:25:00
 */
public class HomeTheaterFacade {
    private Popcorn popcorn;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        popcorn = Popcorn.getInstance();
        dvdPlayer = DVDPlayer.getInstance();
    }
    public void ready(){
        popcorn.on();
        dvdPlayer.on();
        popcorn.pop();
    }

    public void play(){
        dvdPlayer.play();
    }
    public void stop(){
        popcorn.off();
        dvdPlayer.off();
    }
}
