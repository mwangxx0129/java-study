package com.xinxin.shoppingCar;

import java.util.Objects;

public class Item implements Cloneable{

    private Long id;
    private String name;
    private String unit;
    private Double price;

    public Item(Long id, String name, String unit, Double price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass() != getClass())
            return false;
        Item that = (Item) obj;
        if (that.getId() == this.getId())
            return true;
        return false;
    }
}
