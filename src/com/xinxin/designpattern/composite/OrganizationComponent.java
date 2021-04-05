package com.xinxin.designpattern.composite;

public abstract class OrganizationComponent {
    protected String des;
    protected String name;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void print();

    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "name: " + name + "\t des: " + des;
    }
}
