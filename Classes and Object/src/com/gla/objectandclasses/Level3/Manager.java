package com.gla.objectandclasses.Level3;

public class Manager extends Employee {

    public Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }

    public static void main(String[] args) {

        Manager m = new Manager(201, "IT", 50000);

        m.setSalary(60000);

        m.display();
    }
}
