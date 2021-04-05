package com.xinxin.mediator;

public class CoffeeMachine extends Colleague{
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMsg(int stateChange) {
        this.getMediator().getMsg(stateChange, this.name);
    }


    public void startCoffee() {
        System.out.println("It's time to startcoffee!");
    }

    public void finishCoffee() {

        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        sendMsg(0);
    }
}
