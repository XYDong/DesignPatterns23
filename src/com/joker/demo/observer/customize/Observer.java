package com.joker.demo.observer.customize;

/**
 * @version 1.0.0
 * @ClassName Observer.java
 * @Package com.joker.demo.observer
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月19日 15:17:00
 */
public interface Observer {
    void update(float mTemperature,float mPressure,float mHumidity);
}
