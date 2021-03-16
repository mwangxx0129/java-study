package com.xinxin.mediator;

public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMsg(int stateChange) {
        this.getMediator().getMsg(stateChange, this.name);
    }

    public void startTv() {
        System.out.println("It's time to StartTv!");
    }

    public void stopTv() {
        System.out.println("StopTv!");
    }
}
