package org.Interface;

public class Main {
    public static void main(String args[]) {
        System.out.println("Let's learn Interface");
        Stack myStack = new MyStack(5);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.pop();
        myStack.printStack();

        // ********************* Employee
        Employee fullTimeEmployee = new FullTimeEmployee(1, "Tom", 2000);
        Employee partTimeEmployee = new PartTimeEmployee(1, "Dan", 2100, 5, 10);

        // Process the Employee Salary and get Pay
        EmployeePaymentProcessingSystem postprocessing = new EmployeePaymentProcessingSystem();
        postprocessing.processPayment(partTimeEmployee);
    }
}
