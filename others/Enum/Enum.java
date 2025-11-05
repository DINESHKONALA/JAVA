// The enum class is used to define a set of named constants.
// It is a special type of class that can be used to represent a fixed set of values.
// Enums are often used in switch statements and can have methods and fields like regular classes.
// Enums can also implement interfaces.
// Enum class cannot be extended, but it can implement interfaces.
package others.Enum;
enum Status  
{   
    // This are Enum constantse.
    SUCCESS,
    FAILURE,
    PENDING,
    UNKNOWN;
    
}
public class Enum 
{
    public static void main(String[] args) 
    {
        // Accessing enum constants
        Status s = Status.SUCCESS;
        System.out.println("---------------");
        System.out.println("Current status: " + s);
        System.out.println(s.ordinal());
        

        // Using switch statement with enum
        switch (s) 
        {
            case SUCCESS:
                System.out.println("Operation was successful.");
                break;
            case FAILURE:
                System.out.println("Operation failed.");
                break;
            case PENDING:
                System.out.println("Operation is pending.");
                break;
            case UNKNOWN:
                System.out.println("Status is unknown.");
                break;
        }
        if (s == Status.SUCCESS) 
        {
            System.out.println("The operation was successful.");
        } 
        else if (s == Status.FAILURE) 
        {
            System.out.println("The operation failed.");
        } 
        else if (s == Status.PENDING) 
        {
            System.out.println("The operation is pending.");
        } 
        else if (s == Status.UNKNOWN) 
        {
            System.out.println("The status is unknown.");
        }

        System.out.println("---------------");
        // Printing all enum constants
        for (Status i : Status.values()) 
        {
            System.out.println(i + " - " + i.ordinal());
        }
        System.out.println("---------------");

        //or

        Status[] ss = Status.values();
        for (Status i : ss) 
        {
            System.out.println(i + " - " + i.ordinal());
        }

        System.out.println("---------------");

        // Enum with methods
        System.out.println(s.getClass().getSuperclass()); // it tells that enum is a subclass of java.lang.Enum
    }
}

