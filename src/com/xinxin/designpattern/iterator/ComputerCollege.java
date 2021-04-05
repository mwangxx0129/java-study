package com.xinxin.designpattern.iterator;

import java.util.Iterator;

public class ComputerCollege implements College{
    Department[] departments;
    int numOfDepartment = 0;


    ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java major", "Java");
        addDepartment("PHP", "PHP");
        addDepartment("Big Data", "Big Data");
    }

    @Override
    public String getName() {
        return "Computer Science College";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments[numOfDepartment] = new Department(name, desc);
        ++ numOfDepartment;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
