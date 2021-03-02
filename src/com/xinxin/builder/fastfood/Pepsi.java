package com.xinxin.builder.fastfood;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 1.25f;
    }
}
