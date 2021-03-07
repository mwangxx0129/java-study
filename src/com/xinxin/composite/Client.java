package com.xinxin.composite;

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
}
