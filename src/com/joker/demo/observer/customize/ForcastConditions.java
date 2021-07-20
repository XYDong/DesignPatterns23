package com.joker.demo.observer.customize;

/**
 * @version 1.0.0
 * @ClassName ForcastConditions.java
 * @Package com.joker.demo.observer
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月19日 15:29:00
 */
public class ForcastConditions implements Observer {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        display();
    }
    public void display(){
        System.out.println("** tomorrow Temperature = " +(mTemperature+Math.random())+"**");
        System.out.println("** tomorrow Pressure = " +(mPressure+Math.random())+"**");
        System.out.println("** tomorrow Humidity = " +(mHumidity+Math.random())+"**");
        System.out.println("----------------------------------------------------------------");
    }
}
