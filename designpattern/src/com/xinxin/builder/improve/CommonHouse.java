package com.xinxin.builder.improve;

public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("Common house build basic 5 m");
    }

    @Override
    public void buildWall() {
        System.out.println("Common house build 10 cm");
    }

    @Override
    public void roofed() {
        System.out.println("Common house roof");
    }
}
