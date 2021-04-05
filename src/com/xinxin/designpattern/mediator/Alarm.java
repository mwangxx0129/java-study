package com.xinxin.designpattern.mediator;

public class Alarm extends Colleague{

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void sendAlarm(int stateChange) {
        sendMsg(stateChange);
    }

    @Override
    public void sendMsg(int stateChange) {
        this.getMediator().getMsg(stateChange, this.name);
    }
}
