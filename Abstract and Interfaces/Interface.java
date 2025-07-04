interface  Cars // Interface with final variables and abstract method
{
    int age = 20; // Final variable, cannot be changed
    String name = "john"; // Final variable, cannot be changed
    void drive(); // Abstract method without a body 
    void show(); // Additional method to display information
    
}

class BMW implements Cars // Class implementing the interface
{
    public void drive() // Implementing the abstract method
    {
        System.out.println("BMW is driving fast");
    }
    public void show() // Additional method
    {
        System.out.println("This is a BMW car and owned by " + name + " who is " + age + " years old.");
    }

}

public class Interface 
{
    public static void main(String[] args)
    {
        Cars obj = new BMW(); // Creating an instance of the class that implements the interface
        obj.drive(); // Calling the implemented method
        obj.show(); // Calling the additional method

        System.out.println("Interface variable age: " + Cars.age); 
        System.out.println("Interface variable name: " + Cars.name); 
    }
    
}
