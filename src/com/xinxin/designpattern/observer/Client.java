package com.xinxin.designpattern.observer;

public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();

        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(30,150,40);

        System.out.println("==========change============");
        weatherData.setData(40, 160, 25);
    }
}
