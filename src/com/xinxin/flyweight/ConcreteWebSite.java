package com.xinxin.flyweight;

public class ConcreteWebSite extends WebSite{
    private String type;

    ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("The type of website release: " + type);
    }
}
