package com.xinxin.builder.fastfood;

public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 1.0f;
    }
}
