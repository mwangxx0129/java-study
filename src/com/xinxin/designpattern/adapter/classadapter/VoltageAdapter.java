package com.xinxin.designpattern.adapter.classadapter;

// corns: Have to inherent Voltage220V and use
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV = srcV / 44;
        return dstV;
    }
}
