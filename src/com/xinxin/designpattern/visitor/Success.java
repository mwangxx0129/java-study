package com.xinxin.designpattern.visitor;

public class Success extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("success from man");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("success from woman");
    }
}
