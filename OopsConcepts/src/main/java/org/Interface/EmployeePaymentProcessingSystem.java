package org.Interface;

public class EmployeePaymentProcessingSystem {
    // Passing Employee as an argument states. That we can pass any of it's extended class.
    // Part-time or FullTime Employee here
    public EmployeePaymentProcessingSystem () {
    }

    public void processPayment(Payable payable) {
        System.out.println("The payment processing System");
        System.out.println(payable.getPay());
    }
}
