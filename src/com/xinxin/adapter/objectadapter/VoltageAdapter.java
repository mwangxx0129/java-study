package com.xinxin.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if (null != voltage220V) {
            int srcV = voltage220V.output220V();
            System.out.println("Use object adapter...");
            dstV = srcV / 44;
            System.out.println("Complete adapting, output voltage is 5V");
        }
        return dstV;
    }
}
