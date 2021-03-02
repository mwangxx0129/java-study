package com.xinxin.shoppingCar;

public class Item implements Cloneable{

    private Long id;
    private String name;
    private String unit;
    private Double price;

    public Item(String name, String unit, Double price) {
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("name: %s" +
                "\nunit: %s" +
                "\nprice: %f", name, unit, price).toString();
    }

    @Override
    protected Item clone() throws CloneNotSupportedException {
        return (Item) super.clone();
    }
}
