package com.xinxin.designpattern.decorator;

public class Client {
    public static void main(String[] args) {
        // 2 chocolate + milk + Long Black

        Item order = new Milk(new LongBlack());
        System.out.println(order.cost());
        System.out.println(order.getDes());

        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());

        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());

    }
}
