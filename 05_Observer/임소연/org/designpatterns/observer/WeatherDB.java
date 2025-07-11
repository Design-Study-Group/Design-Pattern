package org.designpatterns.observer;

public class WeatherDB implements Observer{
    @Override
    public String toString(){
        return "database";
    }

    @Override
    public void update(float temperature, int humidity) {
        System.out.println("======================== 기상 정보 갱신 ========================");
        System.out.println("INSERT into WEATHER (temperature, humidity)" +
                " VALUES (" + temperature + ", " + humidity + ")");
        System.out.println("============= 갱신된 내용이 데이터베이스에 저장되었습니다. =============\n");
    }
}
