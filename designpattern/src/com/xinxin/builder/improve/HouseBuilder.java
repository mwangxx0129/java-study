package com.xinxin.builder.improve;

// abstract builder
public abstract class HouseBuilder {
    protected House house = new House();

    // abstract methods: process of building
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    public House constructHouse() {
        return house;
    }
}
