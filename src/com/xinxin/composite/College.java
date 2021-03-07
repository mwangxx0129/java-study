package com.xinxin.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String des) {
        this.name = name;
        this.des = des;
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // Customize the business logic of adding college
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("=========" + name + "=========");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}