package com.joker.demo.observer.customize;

/**
 * @version 1.0.0
 * @ClassName Subject.java
 * @Package com.joker.demo.observer
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月19日 15:16:00
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
