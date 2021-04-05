package com.xinxin.state;

public class NoRaffleState extends State {

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
        this.isSink = true;
    }

    @Override
    public void deduceMoney() {
        activity.setState(activity.getCanRaffleState());
        System.out.println("deduceMoney");
    }

    @Override
    public boolean raffle() {
        System.out.println("");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("Can not dispense prize");
    }
}
