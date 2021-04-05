package com.xinxin.designpattern.bridge;

public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    void open() {
        System.out.print("UpRightPhone:\t");
        super.open();
    }

    @Override
    void close() {
        System.out.print("UpRightPhone:\t");
        super.close();
    }

    @Override
    void call() {
        System.out.print("UpRightPhone:\t");
        super.call();
    }
}
