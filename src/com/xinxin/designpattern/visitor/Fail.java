package com.xinxin.designpattern.visitor;

public class Fail extends Action{

    @Override
    public void getManResult(Man man) {
        System.out.println("Fail from man");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Fail from woman");
    }
}
