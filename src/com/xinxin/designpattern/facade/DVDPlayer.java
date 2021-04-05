package com.xinxin.designpattern.facade;

public class DVDPlayer {
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void open() {
        System.out.println("DVD open");
    }

    public void off() {
        System.out.println("DVD off");
    }

    public void play() {
        System.out.println("DVD is playing");
    }

    public void pause() {
        System.out.println("DVD pause ...");
    }
}
