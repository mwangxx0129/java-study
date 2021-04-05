package com.xinxin.designpattern.decorator;

public class Chocolate extends Decorator {

    public Chocolate(Item obj) {
        super(obj);
        setDes("Chocolate");
        setPrice(1.5f);
    }
}
