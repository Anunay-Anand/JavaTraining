package org.Interface;

public class FullTimeEmployee extends Employee{
    private double tax;
    public FullTimeEmployee(int id, String name, int salary) {
        super(id, name, salary);
        tax = .20*salary;
    }
    @Override
    public double getPay() {
        return getSalary() - tax;
    }
}
