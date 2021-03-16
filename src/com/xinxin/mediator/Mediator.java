package com.xinxin.mediator;

public abstract class Mediator {
    public abstract void register(String colleagueName, Colleague colleague);

    public abstract void getMsg(int stateChange, String colleagueName);

    public abstract void sndMsg(int stateChange);
}
