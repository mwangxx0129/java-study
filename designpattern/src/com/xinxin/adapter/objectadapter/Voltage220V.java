package com.xinxin.adapter.objectadapter;

// Adaptee
public class Voltage220V {
    public int output220V() {
        int src = 220;
        System.out.println("Voltage " + src + " V");
        return src;
    }
}
