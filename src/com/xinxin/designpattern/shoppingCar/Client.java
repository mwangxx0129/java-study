package com.xinxin.designpattern.shoppingCar;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShoppingCar shoppingCar = new ShoppingCar();
        Item A = new Item(1L,"CAULIFLOWER", "Lb", 0.99d);
        Item B = new Item(2L,"CHIN KUNG CHOY", "Lb", 1.19d);
        Item C = new Item(3L, "CHINESE CELERY", "Ea", 1.29d);
        Item D = new Item(4L, "CHIVES", "Ea", 1.49d);
        Item E = new Item(5L, "DAIKON", "Lb", 0.69d);
        Item F = new Item(6L, "FRESH BEANCURD", "Ea", 1.19d);
        Item G = new Item(7L, "PEA SPROUTS", "Ea", 2.49d);
        Item H = new Item(8L, "Thanhson Tofu Fresh", "16z", 2.59d);
        Item I = new Item(9L, "TOMATO", "Lb", 0.99d);
        Item J = new Item(10L, "WC Ndl SDong T", "5Lb", 6.99d);
        Item K = new Item(11L, "YOUNG THAI CCOCONUT", "Ea", 2.19d);

        shoppingCar.addItemWithAmount(new ItemWithAmount(A, 1.57));
        shoppingCar.addItemWithAmount(new ItemWithAmount(B, 1.66));
        shoppingCar.addItemWithAmount(new ItemWithAmount(C, 1.0));
        shoppingCar.addItemWithAmount(new ItemWithAmount(D, 1.0));
        shoppingCar.addItemWithAmount(new ItemWithAmount(E, 1.66));
        shoppingCar.addItemWithAmount(new ItemWithAmount(F, 3.0));
        shoppingCar.addItemWithAmount(new ItemWithAmount(G, 1.0));
        shoppingCar.addItemWithAmount(new ItemWithAmount(H, 1.0));
        shoppingCar.addItemWithAmount(new ItemWithAmount(I, 0.96));
        shoppingCar.addItemWithAmount(new ItemWithAmount(J, 1.00));
        shoppingCar.addItemWithAmount(new ItemWithAmount(K, 1.00));
        shoppingCar.postProcess();
    }
}
