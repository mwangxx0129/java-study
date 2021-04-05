package com.xinxin.designpattern.builder.improve;

public class HouseDirector {
    // aggregation builder by constructor or setter
    private HouseBuilder houseBuilder;

    HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // The director is in charge of process of building
    public House deliverHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.constructHouse();
    }
}
