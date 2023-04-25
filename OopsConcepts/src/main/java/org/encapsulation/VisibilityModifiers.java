package org.encapsulation;

 public class VisibilityModifiers {
     // Create classes and identifiers to check their accessibility
     public int a = 10;
     protected int b = 11;
     int c = 12;
     private int d = 13;

     public void publicMethod() {
         System.out.println("I'm a public method");
     }
     protected void protectedMethod() {
         System.out.println("I'm a protected method");
     }
     void defaultMethod() {
         System.out.println("I'm a default method");
     }
     private void privateMethod() {
         System.out.println("I'm a private method");
     }
}
