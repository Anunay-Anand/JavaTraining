package org.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Create a Square Shape
//        Shape squareOne = new Square(4);
//        System.out.println("Area - " + squareOne.findArea());
        Account myAccount = new SavingAccount("Anunay Anand", 100);
        System.out.println(myAccount.toString());
        System.out.println(myAccount.getBalance());
    }
}
