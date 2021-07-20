package com.joker.demo.observer.java;

import com.joker.demo.observer.customize.Observer;

import java.util.List;
import java.util.Observable;

/**
 * @version 1.0.0
 * @ClassName WeatherDataSt.java
 * @Package com.joker.demo.observer
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月19日 15:17:00
 */
//public class WeatherDataSt extends Observable {

public class WeatherDataSt extends Observable {

    List<Observer> observers;
    private float mTemperature;
    private float mPressure;
    private float mHumidity;
    public float getmTemperature() {
        return mTemperature;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void setData(float mTemperature, float mPressure, float mHumidity){
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    private void dataChange() {
        this.setChanged();
        this.notifyObservers(new Data(getmTemperature(),getmPressure(),getmHumidity()));
    }

}
