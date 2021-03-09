package com.xinxin.flyweight;

public class ConcreteWebSite extends WebSite{
    private String type;

    ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(user.getName() + " Release type of website release: " + type);
    }
}
