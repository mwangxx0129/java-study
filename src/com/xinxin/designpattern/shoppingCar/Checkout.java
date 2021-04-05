package com.xinxin.designpattern.shoppingCar;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Checkout {
    private Long id;
    private Double total;
    private List<ItemWithAmount> itemWithAmounts;

    Checkout(List<ItemWithAmount> itemWithAmounts) {
        this.itemWithAmounts = itemWithAmounts;
    }

    public Double getCost() {
        double total = 0.d;
        for (ItemWithAmount itemWithAmount : itemWithAmounts) {
            double cost = new BigDecimal(itemWithAmount.getCost()).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
            total += cost;
        }
        return this.total = total;
    }

    public Double getTax() {
        return total * 0.078;
    }
}
