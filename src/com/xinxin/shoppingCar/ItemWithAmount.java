package com.xinxin.shoppingCar;

public class ItemWithAmount {
    private Item item;
    private Double amount;
    private Double prices;

    ItemWithAmount(Item item, Double amount) {
        this.item = item;
        this.amount = amount;
        this.prices = item.getPrice() * amount;
    }

    public Double getPrices() {
        return this.prices;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {

        return "%s/%s\t\t%d\n" +
                "\t%d" +
        return getItem().getName() + "/" + ((double) amount == 1.0 ? "" :"") + getPrices();

    }
}
