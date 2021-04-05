package com.xinxin.designpattern.bridge;

public class Client {
    public static void main(String[] args) {
        Phone phone = new UpRightPhone(new Vivo());
        phone.process();
        System.out.println("========");
        Phone vivoFlodedPhone = new FlodedPhone(new XiaoMi());
        vivoFlodedPhone.process();
    }
}
