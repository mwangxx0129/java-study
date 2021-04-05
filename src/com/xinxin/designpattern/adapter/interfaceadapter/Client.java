package com.xinxin.designpattern.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        new AbsAdapter() {
            @Override
            public void operation1() {
                System.out.println("user operation1");
            }
        }.operation1();
    }
}
