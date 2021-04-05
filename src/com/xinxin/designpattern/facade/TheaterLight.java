package com.xinxin.designpattern.facade;

public class TheaterLight {
    private static TheaterLight theaterLight = new TheaterLight();
    public static TheaterLight getInstance() {
        return theaterLight;
    }

    void on(){
        System.out.println("Theater Light on");
    }
    void off() {
        System.out.println("Theater Light off");
    }
    void dim() {
        System.out.println("Theater Light dim");
    }
    void bright() {
        System.out.println("Theater Light bright");
    }
}
