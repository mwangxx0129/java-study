package com.xinxin.decorator;

public class Soy extends Decorator{
    public Soy(Item obj, float favorPrice) {
        super(obj);
        setDes("Soy");
        setPrice(favorPrice);
    }
}
