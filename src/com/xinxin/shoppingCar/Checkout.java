package com.xinxin.shoppingCar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Checkout {
    private List<ItemWithAmount> itemWithAmounts;
    Checkout(List<ItemWithAmount> itemWithAmounts) {
        this.itemWithAmounts = itemWithAmounts;
    }

    public Double getCost() {
        return this.itemWithAmounts.stream()
                .map(ItemWithAmount::getPrices)
                .reduce(0.0d, Double::sum);
    }
}
