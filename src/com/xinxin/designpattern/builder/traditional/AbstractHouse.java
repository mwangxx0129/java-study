package com.xinxin.designpattern.builder.traditional;

public abstract class AbstractHouse {
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    // The process of building house
    public void build() {
        buildBasic();
        buildWall();
        roofed();
    }
}
