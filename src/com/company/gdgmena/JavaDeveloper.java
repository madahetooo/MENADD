package com.company.gdgmena;

public class JavaDeveloper extends Company{
    @Override
    public void Salary() {
        System.out.println("Java Developer Salary is 1000$");
    }

    @Override
    public void workingHours() {
        System.out.println("Java developer working hours 40hr per week");
    }

    @Override
    public void daysOff() {
        System.out.println("Java developer have 2 days off per week");
    }
}
