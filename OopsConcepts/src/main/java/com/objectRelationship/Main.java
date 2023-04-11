package com.objectRelationship;

public class Main {
    public static void main(String[] args) {
        // Create an instance of passenger
        Passenger passenger1 = new Passenger("Anunay", "Anand", "Sector-61", "Delhi", 7, 'M');
        Vehicle vehicle = new Metro();
        passenger1.travel(vehicle, "Sector-61", "HauzKhas");
        System.out.println(passenger1.passengerCanTravel());
    }
}
