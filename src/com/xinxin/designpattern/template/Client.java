package com.xinxin.designpattern.template;

public class Client {
    public static void main(String[] args) {
        new PeanutSoyMilk().make();

        new RedBeanSoyMilk().make();

        new PureSoyMilk().make();
    }
}
