package org.designpatterns.observer;

public class WeatherAlert implements Observer {
    private float temperature;
    private int humidity;

    @Override
    public String toString() {
        return "alert";
    }

    @Override
    public void update(float temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        alert(temperature, humidity);
    }

    public void alert(float temperature, int humidity) {
        if (temperature >= 35) {
            System.out.println("[Alert] 🔥 폭염 주의보! 현재 온도: " + temperature + "도\n");
        }
        if (humidity > 70) {
            System.out.println("[Alert] 💧 습도 높음! 불쾌지수 주의하세요.\n");
        }
    }
}

