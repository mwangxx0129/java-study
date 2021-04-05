package com.xinxin.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
    List<College> collegeList;
    OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege() {
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.println(college.getName());
            printDepartment((Iterator) college.createIterator());
        }
    }

    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println(d.getName());

        }
    }
}
