package com.xinxin.designpattern.decorator;

public class Coffee extends Item {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
