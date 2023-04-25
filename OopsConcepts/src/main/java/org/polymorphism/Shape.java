package org.polymorphism;

abstract public class Shape {
    // Define the identifiers
    private int sideOne;
    private int sideTwo;

    // Parametrized Constructor
    public Shape(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    // Method to find Area of Shape
    int findArea() {
        return this.sideOne * this.sideTwo;
    }
    // Method to find the Perimeter of Shape
    abstract int findPerimeter();
}

class Square extends Shape {
    int side;
    public Square(int side) {
        super(side, side);
    };

    @Override
    int findPerimeter() {
        return 4 * side;
    }
}

class Rectangle extends Shape {
    int sideA;
    int sideB;
    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
    };

    @Override
    int findPerimeter() {
        return 2*(sideA + sideB);
    }
}
