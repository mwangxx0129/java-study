package com.xinxin.designpattern.command;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        TvReceiver tvReceiver = new TvReceiver();

        Command lightOnCommand = new LightOnCommand(lightReceiver);
        Command lightOffCommand = new LightOffCommand(lightReceiver);
        Command tvOnCommand = new TvOnCommand(tvReceiver);
        Command tvOffCommand = new TvOffCommand(tvReceiver);


        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("=================test light=====================");
        System.out.println("====== Press light on ========");
        remoteController.onButtonWasPushed(0);

        System.out.println("====== Press light off ========");
        remoteController.offButtonWasPushed(0);

        System.out.println("====== Press undo ========");
        remoteController.undoButtonWasPushed();

        System.out.println("=================test Tv=====================");
        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);
        remoteController.undoButtonWasPushed();



    }
}
