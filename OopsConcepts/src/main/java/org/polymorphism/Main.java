package org.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Create a Square
        Shape squareOne = new Square(4);
        Shape rectangleOne = new Rectangle(6, 4);
        // Understanding upcasting and downcasting
        Square squareTwo = (Square) squareOne; // This is an example of Object Downcasting

        // Understanding abstract classes and how abstract method works.
//        Account myAccount = new SavingAccount("Anunay Anand", 100);
//        System.out.println(myAccount.toString());
//        System.out.println(myAccount.getBalance());
    }
}
