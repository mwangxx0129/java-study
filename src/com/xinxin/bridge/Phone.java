package com.xinxin.bridge;

public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    void open() {
        this.brand.open();
    }

    void close() {
        this.brand.close();
    }

    void call() {
        this.brand.call();
    }

    void process() {
        this.open();
        this.call();
        this.close();
    }
}
