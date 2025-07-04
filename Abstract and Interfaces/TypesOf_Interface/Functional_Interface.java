package TypesOf_Interface;

@FunctionalInterface // This annotation indicates that the interface is a functional interface
interface FunctionalInterface1 {
    // A functional interface can have only one abstract method
    void execute();
    // void anotherMethod(); // This is an additional abstract method, making it non-functional

    // It can also have default and static methods
    default void defaultMethod() {
        System.out.println("This is a default method in a functional interface.");
    }

    static void staticMethod() {
        System.out.println("This is a static method in a functional interface.");
    }
}


class FunctionalInterfaceImpl implements FunctionalInterface1 {
    // Implementing the abstract method from the functional interface
    public void execute() {
        System.out.println("Executing the functional interface method.");
    }
}

public class Functional_Interface 
{
    public static void main(String[] args) 
    {
        FunctionalInterface1 obj = new FunctionalInterfaceImpl();
        obj.execute(); // Calls the implemented method

        //OR

        FunctionalInterface1 obj1 = new FunctionalInterface1() {
            public void execute() 
            {
                System.out.println("Executing the anonymous class implementation of the functional interface.");
            }
        };
        obj1.execute(); // Calls the anonymous class implementation

    }
    
}
