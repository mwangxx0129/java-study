package com.xinxin.shoppingCar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCar {
    private List<Item> items = new ArrayList<>();
    private List<ItemWithAmount> itemWithAmounts = new ArrayList<>();
    private Checkout checkout;

    public void addItem(Item item) {
        items.add(item);
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    private Map<Item, Integer> getItemAmounts() {
        Map<Item, Integer> result = new HashMap<>();
        for (Item item: items) {
            result.put(item, result.getOrDefault(item, 0) + 1);
        }
        return result;
    }

    public void postProcess() {
        Map<Item, Integer> result = getItemAmounts();
        for (Map.Entry<Item, Integer> e : result.entrySet()) {
            itemWithAmounts.add(new ItemWithAmount(e.getKey(), 1.0 * e.getValue()));
        }
        checkout = new Checkout(itemWithAmounts);
        printMap();
    }

    private void printMap() {
        for (ItemWithAmount itemWithAmount : itemWithAmounts) {
            System.out.println(itemWithAmount.toString());
            System.out.println();
        }
        for (ItemWithAmount itemWithAmount : itemWithAmounts) {
            System.out.println(itemWithAmount.toString());;
        }
        for (Map.Entry e : this.getItemAmounts().entrySet()) {
            System.out.println(e.getKey() + '\t');
            e.getKey(), e.getValue()
        }
        System.out.println("TOTAL\t" + checkout.getCost());

    }

    private void print() {
        for (Item item : items) {
            System.out.println(item.toString());
            System.out.println();
        }
        System.out.println("TOTAL\t" + checkout.getCost());

    }
}
