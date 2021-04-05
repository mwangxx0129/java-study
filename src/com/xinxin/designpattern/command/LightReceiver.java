package com.xinxin.designpattern.command;

public class LightReceiver {
    private String light;
    public void on() {
        System.out.println("light on");
    }

    public void off() {
        System.out.println("light off");
    }
}
