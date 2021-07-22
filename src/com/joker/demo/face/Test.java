package com.joker.demo.face;

/**
 * @version 1.0.0
 * @ClassName Test.java
 * @Package com.joker.demo.face
 * @Author Joker
 * @Description 需要遵循最少知识原则
 * @CreateTime 2021年07月22日 10:28:00
 */
public class Test {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.stop();
    }
}
