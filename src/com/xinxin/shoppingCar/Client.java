package com.xinxin.shoppingCar;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShoppingCar shoppingCar = new ShoppingCar();
        Item A = new Item("A", "Ea", 3.0d);
        shoppingCar.addItem(A);
        shoppingCar.addItem(new Item("B", "Ea", 6.0d));
        shoppingCar.addItem(A.clone());
        shoppingCar.postProcess();
    }
}
