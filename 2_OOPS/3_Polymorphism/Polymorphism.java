// 3. Polymorphism 🎭
// Polymorphism literally means "many forms." 
// It is the ability of a variable, function, or object to take on multiple forms. 
// In Java, polymorphism is mainly achieved in two ways:

// Compile-time Polymorphism               (Method Overloading): 
// Defining multiple methods in the same class with the same name but different parameters (different number, types, or order of arguments).
class Calculator {
    // 1. Overloaded Method: Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // 2. Overloaded Method: Adds three integers (Different number of arguments)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3. Overloaded Method: Adds two doubles (Different type of arguments)
    public double add(double a, double b) {
        return a + b;
    }
}
// Run-time Polymorphism                   (Method Overriding): 
// A subclass providing a specific implementation for a method that is already defined in its superclass. This is achieved through dynamic method dispatch.
// Parent Class (Superclass)
class Vehicle {
    // Method to be overridden in subclasses
    public void run() {
        System.out.println("Vehicle is running on the road.");
    }
}

// Child Class (Subclass)
class Car extends Vehicle {
    // Method Overriding: Provides a specific implementation
    @Override // Good practice to use this annotation
    public void run() {
        System.out.println("Car is running efficiently with four wheels.");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        // Compile-time Polymorphism Example
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 and 3 is  " + calc.add(2, 3)); // Calls add(int, int)
        System.out.println("Sum of 2, 3 and 4 = " + calc.add(2, 3, 4)); // Calls add(int, int, int)
        System.out.println("Sum of 2.5 and 3.5 =  " + calc.add(2.5, 3.5)); // Calls add(double, double)

        // Run-time Polymorphism Example
        Vehicle myVehicle = new Vehicle(); // Superclass reference and object
        myVehicle.run(); // Calls Vehicle's run()

        Vehicle myCar = new Car(); // Superclass reference but subclass object
        myCar.run(); // Calls Car's overridden run()
    }
    
}
