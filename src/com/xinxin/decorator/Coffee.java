package com.xinxin.decorator;

public class Coffee extends Item {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
