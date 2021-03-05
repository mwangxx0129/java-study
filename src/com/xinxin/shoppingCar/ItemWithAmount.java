package com.xinxin.shoppingCar;

public class ItemWithAmount {
    private Item item;
    private Double amount;
    private Double cost;

    ItemWithAmount(Item item, Double amount) {
        this.item = item;
        this.amount = amount;
        this.cost = item.getPrice() * amount;
    }

    public Double getCost() {
        return this.cost;
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
        return String.format("%-25s %.2f", (this.item.getName() + "/" + this.item.getUnit()), cost) +
                (Double.compare(amount, 1) == 0 ? ""
                        : "\n\t" + amount + " " + this.item.getUnit().toUpperCase() + " @ $" + this.item.getPrice() + "/" + this.item.getUnit().toUpperCase());

    }
}
