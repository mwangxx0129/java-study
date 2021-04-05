package com.xinxin.designpattern.composite;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("CSUEB", "Cal state University East Bay");

        OrganizationComponent csCollege = new College("CS", "Computer Science");
        OrganizationComponent ieCollege = new College("IE", "Information Engineer");

        csCollege.add(new Department("Software", "Eddie Right"));
        csCollege.add(new Department("Embedded", "Kevin Brown"));

        ieCollege.add(new Department("Information engineering", "hard to learn"));
        ieCollege.add(new Department("Communication engineering", "easy to learn"));

        university.add(csCollege);
        university.add(ieCollege);

        university.print();

    }

    static void jdkComposite() {
        // 1. Map is abstract layer = Component
        // 2. HashMap is Composite, implement / extend related method
        //      put, putAll
        // 3. Node is static inner class. It is leaf; it does not have put, putAll
        //    static class Node implement Map.Entry<K,V>
        Map<Integer, String> map = new HashMap<>();
    }
}
