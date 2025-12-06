package com2OOPS.sub2Inheritance.SubClassAndObject;
class AnonymousObjectDemo {
    public AnonymousObjectDemo() {
        // Default constructor
        System.out.println("Default constructor called");
    }
    public void show() {
        // Parameterized constructor
        System.out.println("Parameterized constructor called ");
    }
}
class AnonymousObject {
    public static void main(String[] args) {
        // Creating an anonymous object
        System.out.println();
        new AnonymousObjectDemo().show(); // Calls the show method of the anonymous object
        System.out.println();
        new AnonymousObjectDemo(); // Calls the default constructor of the anonymous object
        System.out.println();
        new AnonymousObjectDemo().show();
    }
}
