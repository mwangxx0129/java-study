package com.xinxin.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    private Department[] departments;
    private int position = 0;

    ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = this.departments[position];
        ++ position;
        return department;
    }

    @Override
    public void remove() {
        //nothing
    }
}
