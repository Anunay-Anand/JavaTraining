package org.Interface;

abstract public class Employee implements Payable{
    private int id;
    private String name;
    private int salary;
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public abstract double getPay();
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public int getId () {
        return id;
    }
    public void setId() {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary() {
        this.salary = salary;
    }
}
