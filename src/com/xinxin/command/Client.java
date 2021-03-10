package com.xinxin.command;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        Command lightOnCommand = new LightOnCommand(lightReceiver);
        Command lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("====== Press light on ========");
        remoteController.onButtonWasPushed(0);

        System.out.println("====== Press light off ========");
        remoteController.offButtonWasPushed(0);

        System.out.println("====== Press undo ========");
        remoteController.undoButtonWasPushed();
    }
}
