package com.xinxin.state;

public abstract class State {
    protected RaffleActivity activity;
    protected boolean isSink;

    public abstract void deduceMoney();
    public abstract boolean raffle();
    public abstract void dispensePrize();

    public boolean isSink() {
        return isSink;
    }

    public void setSink(boolean sink) {
        isSink = sink;
    }
}
