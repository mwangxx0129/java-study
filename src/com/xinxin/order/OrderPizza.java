package com.xinxin.order;

import com.xinxin.pizza.CheesePizza;
import com.xinxin.pizza.GreekPizza;
import com.xinxin.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType = "greek";

        do {
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("greek pizza");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("cheese pizza");
            } else {
                System.out.println("no exist pizza");
            }
        } while (true);

    }

    private String getType() {

        return null;
    }
}
