package org.designpatterns.observer;

public class WeatherDisplay implements Observer {
    private float temperature;
    private int humidity;

    @Override
    public String toString(){
        return "display";
    }

    @Override
    public void update(float temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        showWeatherInfo();
    }

    public void showWeatherInfo() {
        System.out.println("☀️☁️🌧️❄️🌫️날씨 전광판🌫❄️🌧️☁️☀️");
        System.out.println("현재 온도🌡️: " + temperature + " 현재 습도🚿: " + humidity + "%");
        System.out.println("===== 이상 현재 날씨였습니다. =====\n");
    }
}
