package com.xinxin.designpattern.builder.traditional;

public class CommonHouse extends AbstractHouse{

    @Override
    public void buildBasic() {
        System.out.println("Common house build basic");
    }

    @Override
    public void buildWall() {
        System.out.println("Common house build wall");
    }

    @Override
    public void roofed() {
        System.out.println("Common house roofed");
    }
}
