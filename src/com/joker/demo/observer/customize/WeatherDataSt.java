package com.joker.demo.observer.customize;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.0
 * @ClassName WeatherDataSt.java
 * @Package com.joker.demo.observer
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月19日 15:17:00
 */
//public class WeatherDataSt extends Observable {

public class WeatherDataSt implements Subject {

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
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        if (observers != null && observers.size() > 0) {
            observers.forEach(var -> {
                var.update(getmTemperature(),getmPressure(),getmHumidity());
            });
        }
    }
}
