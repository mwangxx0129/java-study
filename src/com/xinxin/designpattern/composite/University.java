package com.xinxin.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String des) {
        this.name = name;
        this.des = des;
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println("=========" + getName() + "=========");
        for (OrganizationComponent organizationComponent: organizationComponents) {
            organizationComponent.print();
        }
    }
}
