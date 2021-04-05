package com.xinxin.state;

import java.util.Random;

public class CanRaffleState extends State{

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("Have deduced Money");
    }

    @Override
    public boolean raffle() {
        Random random = new Random();
        int num = random.nextInt(10);
        if (num == 0) {
            activity.setState(activity.getDispenseState());
            System.out.println("Congrats for get prize!");
            return true;
        } else {
            activity.setState(activity.getNoRaffleState());
            System.out.println("Sorry, please try again");
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        throw new UnsupportedOperationException();
    }
}
