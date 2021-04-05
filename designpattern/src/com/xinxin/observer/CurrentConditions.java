package com.xinxin.observer;

public class CurrentConditions {
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Today temp:" + temperature);
        System.out.println("Today pressure:" + pressure);
        System.out.println("Today humidity:" + humidity);

    }

}
