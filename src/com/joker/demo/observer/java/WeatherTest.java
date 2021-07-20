package com.joker.demo.observer.java;

/**
 * @version 1.0.0
 * @ClassName WeatherTest.java
 * @Package com.joker.demo.observer
 * @Author Joker
 * @Description 观察者模式
 * @CreateTime 2021年07月19日 15:40:00
 */
public class WeatherTest {
    public static void main(String[] args) {
        WeatherDataSt weatherDataSt = new WeatherDataSt();
        CurrentConditions currentConditions = new CurrentConditions();
        ForcastConditions forcastConditions = new ForcastConditions();
        weatherDataSt.addObserver(currentConditions);
        weatherDataSt.addObserver(forcastConditions);
        weatherDataSt.setData(11,12,13);

        weatherDataSt.deleteObserver(currentConditions);
        weatherDataSt.setData(14,15,16);
    }
}
