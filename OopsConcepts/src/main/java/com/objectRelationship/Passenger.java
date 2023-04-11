package com.objectRelationship;

class Vehicle {
    // Define the default constructor/ It is automatically defined by Java
    Vehicle() {};

    // Define methods
    public void move(String firstName, String source, String destination) {
        System.out.println("The passenger with firstName " + firstName);
        System.out.println("He is moving from - " + source + " to - " + destination);
    }
}

class Car extends Vehicle {
    // Define the properties
    Car() {};

    public void move(String firstName, String source, String destination) {
        System.out.println("The passenger with firstName " + firstName);
        System.out.println("He is moving from - " + source + " to - " + destination);
    }
}

class Metro extends Vehicle {
    // Define the properties
    Metro() {};

    public void move(String firstName, String source, String destination) {
        System.out.println("The passenger with firstName " + firstName);
        System.out.println("He is moving from - " + source + " to - " + destination);
    }
}

public class Passenger {
    // Define the properties of a passenger
    static int counter = 1;
    Metro metro;
    private int id;
    private String firstName = "testUser";
    private String lastName;

    private static int minAge = 18;
    private int age;
    private char gender;


    public Passenger(){};
    public Passenger(String firstName,String lastName, String source, String destination, int age,char gender) {
        this.id = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public void travel (Vehicle vehicle, String source, String destination) {
        vehicle.move(this.firstName, source, destination);
    }

    public boolean passengerCanTravel() {
        if(this.age < Passenger.minAge) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "The fullName of Passenger (" + this.id + ") is - " + this.firstName + " " + this.lastName;
    }
}
