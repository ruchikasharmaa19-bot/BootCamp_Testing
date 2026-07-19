package com.cons;

public class instance {

    // Instance variables
    int id = 101;
    String name = "Ruchika";
    double salary = 50000.0;

    public static void main(String[] args) {

        // Creating an object
        instance emp = new instance();

        // Accessing instance variables
        System.out.println("Employee ID: " + emp.id);
        System.out.println("Employee Name: " + emp.name);
        System.out.println("Employee Salary: " + emp.salary);
    }
}