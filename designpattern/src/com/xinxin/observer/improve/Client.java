package com.xinxin.observer.improve;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new CurrentConditions());
        weatherData.setData(30, 150, 40);

        System.out.println("==========change============");
        weatherData.registerObserver(new BaiduSite());
        weatherData.setData(40, 160, 25);
    }
}
