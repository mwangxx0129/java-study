package com.xinxin.designpattern.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare Cheese pizza");
    }
}
