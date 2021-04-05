package com.xinxin.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

public class InformationCollegeIterator implements Iterator {

    private List<Department> departmentList;
    private int index = -1;

    InformationCollegeIterator(List<Department> departments) {
        this.departmentList = departments;
    }

    @Override
    public boolean hasNext() {

        if (index >= departmentList.size() - 1) {
            return false;
        } {
            ++ index;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    @Override
    public void remove() {

    }
}
