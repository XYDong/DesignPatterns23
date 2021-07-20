package com.joker.demo.observer.java;


import java.util.Observable;
import java.util.Observer;

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

    public void display(){
        System.out.println("** tomorrow Temperature = " +(mTemperature+Math.random())+"**");
        System.out.println("** tomorrow Pressure = " +(mPressure+Math.random())+"**");
        System.out.println("** tomorrow Humidity = " +(mHumidity+Math.random())+"**");
        System.out.println("----------------------------------------------------------------");
    }

    @Override
    public void update(Observable o, Object arg) {
        Data data = (Data) arg;
        this.mTemperature = data.getmTemperature();
        this.mPressure = data.getmPressure();
        this.mHumidity = data.getmHumidity();
        display();
    }
}
