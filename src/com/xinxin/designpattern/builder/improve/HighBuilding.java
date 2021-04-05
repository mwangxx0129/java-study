package com.xinxin.designpattern.builder.improve;

public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("High building build basic 100 m");
    }

    @Override
    public void buildWall() {
        System.out.println("High building build wall 20 cm");
    }

    @Override
    public void roofed() {
        System.out.println("High building build transparent roof");
    }
}
