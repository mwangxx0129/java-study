package com.xinxin.designpattern.command;

public class TvOnCommand implements Command{
    TvReceiver tvReceiver;

    TvOnCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
