package com.xinxin.builder.fastfood;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public Meal addItem(Item item) {
        items.add(item);
        return this;
    }

    public float getCost() {
        return items.stream()
                .map(e -> e.price())
                .reduce(0.0f, Float::sum);
    }

    public void showItems() {
        for (Item item: items) {
            System.out.println("Item:" + item.name());
            System.out.println(", Packing:" + item.packing().pack());
            System.out.println(", Price:" + item.price());
        }
    }
}
