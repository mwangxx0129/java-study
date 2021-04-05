package com.xinxin.designpattern.state;

public class DispenseOutState extends State {

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
        this.isSink = true;
    }

    @Override
    public void deduceMoney() {
        System.out.println("Dispense out");
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean raffle() {
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("Dispense out");
    }
}
