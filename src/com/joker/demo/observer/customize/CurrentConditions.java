package com.joker.demo.observer.customize;

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

    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
       this.mTemperature = mTemperature;
       this.mPressure = mPressure;
       this.mHumidity = mHumidity;
       display();
    }
    public void display(){
        System.out.println("** Today Temperature = " +mTemperature+"**");
        System.out.println("** Today Pressure = " +mPressure+"**");
        System.out.println("** Today Humidity = " +mHumidity+"**");
        System.out.println("----------------------------------------------------------------");
    }
}
