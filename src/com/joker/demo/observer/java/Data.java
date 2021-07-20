package com.joker.demo.observer.java;

/**
 * @version 1.0.0
 * @ClassName Data.java
 * @Package com.joker.demo.observer.java
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月19日 16:15:00
 */
class Data {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    public Data(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
    }

    public float getmTemperature() {
        return mTemperature;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }
}
