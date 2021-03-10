package com.xinxin.command;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; ++ i) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int num, Command onCommand, Command offCommand) {
        onCommands[num] = onCommand;
        offCommands[num] = offCommand;
    }

    public void onButtonWasPushed(int num) {
        onCommands[num].execute();
        undoCommand = onCommands[num];
    }

    public void offButtonWasPushed(int num) {
        offCommands[num].execute();
        undoCommand = offCommands[num];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
