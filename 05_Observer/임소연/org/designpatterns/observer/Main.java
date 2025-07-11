package org.designpatterns.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherDisplay display = new WeatherDisplay();
        WeatherDB db = new WeatherDB();
        WeatherAlert alert = new WeatherAlert();

        station.registerObserver(display);
        station.registerObserver(db);
        station.registerObserver(alert);

        station.setMeasurements(35.0f, 40);
        station.removeObserver(db);
        station.setMeasurements(33.5f, 78);
    }
}
