package com.xinxin.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("==== Object Adapter ===");
        new Phone().charge(new VoltageAdapter(new Voltage220V()));
    }
}
