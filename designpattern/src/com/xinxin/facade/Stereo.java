package com.xinxin.facade;

public class Stereo {

    private static Stereo stereo = new Stereo();

    public static Stereo getInstance() {
        return stereo;
    }

    public void on() {
        System.out.println("Stereo on");
    }
    public void off() {
        System.out.println("Stereo off");
    }

    public void up() {
        System.out.println("Stereo up");
    }

    public void down() {
        System.out.println("Stereo down");
    }
}
