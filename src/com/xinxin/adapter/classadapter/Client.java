package com.xinxin.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("==== Adapter ===");
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter());
    }
}
