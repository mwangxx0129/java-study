package com.xinxin.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College{

    List<Department> departmentList;

    InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("Security of network", "");
        addDepartment("Security of server", "");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void addDepartment(String name, String desc) {
        departmentList.add(new Department(name, desc));
    }

    @Override
    public Iterator createIterator() {
        return new InformationCollegeIterator(departmentList);
    }
}
