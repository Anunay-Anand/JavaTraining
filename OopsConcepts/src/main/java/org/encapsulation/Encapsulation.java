package org.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        // Create instance of visibilityModifiers class
        VisibilityModifiers test = new VisibilityModifiers();
        // Except for private in another class in same package all are accessible
        System.out.println(test.c);
    }
}

class Encapsulation2 extends VisibilityModifiers {
    public static void main(String[] args) {
        // Subclass in the same package all are accessible (public, protected, default)
        Encapsulation2 test2 = new Encapsulation2();
        System.out.println(test2.a);
    }
}
