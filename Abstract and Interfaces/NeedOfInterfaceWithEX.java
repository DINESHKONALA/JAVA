interface Computer
{
    void code(); // Abstract method to be implemented by classes
  
}
class Laptop implements Computer // Class implementing the interface
{
    public void code() // Implementing the abstract method
    {
        System.out.println("Coding on a Laptop");
    }
}
class Desktop implements Computer // Class implementing the interface
{
    public void code() // Implementing the abstract method
    {
        System.out.println("Coding on a Desktop");
    }
}
class Developer
{
    public void devApp(Computer comp) // Method that takes an interface type as a parameter
    {
        comp.code(); // Calling the method defined in the interface
    }


}
public class NeedOfInterfaceWithEX 
{
    public static void main(String[]args)
    {
        Computer obj = new Laptop(); // Creating an instance of the Laptop class
        obj.code(); // Calling the implemented method

        Computer obj2 = new Desktop(); // Creating an instance of the Desktop class
        obj2.code(); // Calling the implemented method

        Developer dev = new Developer(); // Creating an instance of the Developer class
        dev.devApp(obj); // Passing the Laptop object to the method
        dev.devApp(obj2); // Passing the Desktop object to the method

    }
}
