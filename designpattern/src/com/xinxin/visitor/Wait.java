package com.xinxin.visitor;

public class Wait extends Action{

    @Override
    public void getManResult(Man man) {
        System.out.println("Man get wait status");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Woman get wait status");
    }
}
