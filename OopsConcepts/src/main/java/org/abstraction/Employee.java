package org.abstraction;

import org.encapsulation.Encapsulation;
import org.encapsulation.VisibilityModifiers;

// This class lays basic foundation of an employee entity
public class Employee {

    // Define the identifiers
    private int id = 10;
    private String name;
    private double salary;
    private static String companyName = "UKG";

    // Default Constructor
    public Employee(){};

    // Parameterized Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void fetchEmployeeInfo() {
        System.out.println("id : " + id);
        System.out.println("name : " + name);
        System.out.println("salary : " + salary);
    }

    public void increaseSalary(int newSalary) {
        // Check if newSalary is greater than current Salary
        if(this.salary < newSalary) {
            this.salary = newSalary;
            System.out.println("The updated salary is - " + newSalary);
        }
        return;
    }
}

class Encapsulationhelper extends VisibilityModifiers {
    public static void main(String[] args) {
        // Only public data or method is accessible in a class from other package.
        VisibilityModifiers test3 = new VisibilityModifiers();
        System.out.println(test3.a);
        // Although if we extend the class and make it a subClass. We can access public and protected.
        Encapsulationhelper test4 = new Encapsulationhelper();
        System.out.println(test4.b);
    }
}