package com.xinxin.shoppingCar;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCar {
    private final List<ItemWithAmount> itemWithAmounts = new ArrayList<>();
    private Checkout checkout;

    public void postProcess() {
        checkout = new Checkout(itemWithAmounts);
        printMap();
    }

    public void addItemWithAmount(ItemWithAmount itemWithAmount) {
        itemWithAmounts.add(itemWithAmount);
    }

    private void printMap() {
        itemWithAmounts.stream().map(ItemWithAmount::toString).forEach(System.out::println);
        System.out.println("TOTAL\t" + checkout.getCost());
        System.out.println("TAX\t" + checkout.getTax());
        System.out.println("\nItem Count " + this.getItemCount());

    }

    private int getItemCount() {
        int sum  = 0;
        for (ItemWithAmount itemWithAmount : itemWithAmounts) {
            if (itemWithAmount.getItem().getUnit().equalsIgnoreCase("EA")) {
                sum += 1 * itemWithAmount.getAmount();
            } else {
                sum += 1;
            }
        }
        return sum;
    }
}
