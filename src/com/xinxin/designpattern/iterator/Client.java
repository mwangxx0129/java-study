package com.xinxin.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<>();
        collegeList.add(new ComputerCollege());
        collegeList.add(new InfoCollege());
        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();
    }
}
