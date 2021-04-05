package com.xinxin.designpattern.template;

public class PureSoyMilk extends SoyMilk{

    @Override
    public void addCondiments() {

    }

    @Override
    public boolean wantCondiments() {
        return false;
    }
}
