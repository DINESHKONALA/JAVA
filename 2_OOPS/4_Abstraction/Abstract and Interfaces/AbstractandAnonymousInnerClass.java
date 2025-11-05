abstract class Car
{
    public abstract void drive(); // Abstract method with no body
}


public class AbstractandAnonymousInnerClass 
{
    public static void main(String [] args)
    {
        Car obj = new Car()
        {
            public void drive() // Implementing the abstract method
            {
                System.out.println("Car is running");
            }
        };
        obj.drive();
    }
    
}
