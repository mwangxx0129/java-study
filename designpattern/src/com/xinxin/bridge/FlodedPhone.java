package com.xinxin.bridge;

public class FlodedPhone extends Phone{
    public FlodedPhone(Brand brand) {
        super(brand);
    }

    @Override
    void open() {
        System.out.print("Floded phone:\t");
        super.open();

    }

    @Override
    void close() {
        System.out.print("Floded phone:\t");
        super.close();
    }

    @Override
    void call() {
        System.out.print("Floded phone:\t");
        super.call();
    }
}
