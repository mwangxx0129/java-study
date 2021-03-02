package com.xinxin.builder.fastfood;

public class NonVegBurger extends Burger{
    @Override
    public String name() {
        return "Non Veg Burger";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
