package com.xinxin.composite;

public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        this.name = name;
        this.des = des;
    }

    @Override
    protected void print() {
        System.out.println("name:" + name + "\tdes: " + des);
    }
}
