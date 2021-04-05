package com.xinxin.designpattern.builder.improve;

public class Client {
    public static void main(String[] args) {
        // Define the type of house
        CommonHouse commonHouse = new CommonHouse();

        // Request a director of building house
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        // Deliver house from director
        houseDirector.deliverHouse();

        System.out.println("===========");
        // One more building
        HighBuilding highBuilding = new HighBuilding();
        houseDirector.setHouseBuilder(highBuilding);
        houseDirector.deliverHouse();
    }
}
