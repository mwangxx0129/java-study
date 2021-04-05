package com.xinxin.designpattern.adapter.classadapter;

public class Phone {
    public void charge(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("Voltage is 5V; can charge...");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("Voltage is greater than 5V, can NOT charge");
        } else {
            System.out.println("Voltage is less than 5V, can NOT charge");
        }
    }
}
