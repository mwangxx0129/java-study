package com.xinxin.state;

public class DispenseState extends State{
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("Can not deduce Money in DispenseOutState");
    }

    @Override
    public boolean raffle() {
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("dispense prize");
        activity.getCount();
    }
}
