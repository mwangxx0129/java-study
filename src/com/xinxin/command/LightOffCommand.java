package com.xinxin.command;

public class LightOffCommand implements Command{
    LightReceiver lightReceiver;

    LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }
    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
