abstract class Car 
{
    public abstract void drive(); // Abstract method with no body

    public void stop() // Regular method with a body
    {
        System.out.println("Car stopped");
    }

}

class Lamborghini extends Car 
{
  
    public void drive() // Implementing the abstract method
    {
        System.out.println("Lamborghini is driving fast");
    }
}
public class AbstractKeyword 
{
    public static void main(String[]args)
    {
        Car obj = new Lamborghini(); // Creating an instance of the subclass
        obj.drive(); // Calling the implemented method
        obj.stop(); // Calling the regular method from the abstract class
    }   
}
