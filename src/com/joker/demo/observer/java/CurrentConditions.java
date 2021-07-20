package com.joker.demo.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * @version 1.0.0
 * @ClassName CurrentConditions.java
 * @Package com.joker.demo.observer
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月19日 15:22:00
 */
public class CurrentConditions implements Observer {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    public void display(){
        System.out.println("** Today Temperature = " +mTemperature+"**");
        System.out.println("** Today Pressure = " +mPressure+"**");
        System.out.println("** Today Humidity = " +mHumidity+"**");
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
