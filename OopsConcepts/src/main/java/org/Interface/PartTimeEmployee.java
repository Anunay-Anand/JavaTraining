package org.Interface;

public class PartTimeEmployee extends Employee{
    private int noOfHours;
    private int noOfDays;
    public PartTimeEmployee(int id, String name, int salary, int noOfHours, int noOfDays) {
        super(id, name, salary);
        this.noOfHours = noOfHours;
        this.noOfDays = noOfDays;
    }
    @Override
    public double getPay() {
        return getSalary() * noOfDays * noOfHours;
    }
    @Override
    public String toString() {
        return "The Pay for Employee Named - " + getName() + " is equal to - " + getPay();
    }
}
