package com.xinxin.designpattern.decorator;

public class Milk extends Decorator {
    public Milk(Item obj) {
        super(obj);
        setDes("Milk");
        setPrice(1.0f);
    }
}
