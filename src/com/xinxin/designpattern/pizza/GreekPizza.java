package com.xinxin.designpattern.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare Greek pizza");
    }
}
