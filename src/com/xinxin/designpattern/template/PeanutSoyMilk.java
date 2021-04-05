package com.xinxin.designpattern.template;

public class PeanutSoyMilk extends SoyMilk{
    @Override
    public void addCondiments() {
        System.out.println("Step 2: add good peanut");
    }
}
