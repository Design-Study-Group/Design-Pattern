package org.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private float temperature;
    private int humidity;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("업무 시간이 종료되어 " + observer.toString() + "를 보고 대상에서 제거합니다.\n");
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    public void setMeasurements(float temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}
