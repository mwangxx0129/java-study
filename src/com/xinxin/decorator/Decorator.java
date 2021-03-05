package com.xinxin.decorator;

public class Decorator extends Item {
    private Item obj; // Base

    public Decorator(Item obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return des + " " + super.getPrice() + " && " + obj.getDes();
    }
}
