package com.xinxin.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare Greek pizza");
    }
}
