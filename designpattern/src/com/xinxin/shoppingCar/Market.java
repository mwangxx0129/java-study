package com.xinxin.shoppingCar;

import java.util.List;

public class Market  {
    private String name;
    private String address;
    private String city;
    private String state;
    private List<String> phones;

    List<Cashier> cashiers;

    public static void main(String[] args) {
        String s = "id=";
        System.out.println(s.split("=").length);
    }
}
