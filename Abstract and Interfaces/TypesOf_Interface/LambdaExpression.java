package TypesOf_Interface;

@FunctionalInterface // This annotation indicates that this interface is a functional interface
interface A
{
    public void show();    // abstract method ӟλή Whether it has a functional interface or not, it depends on the number of abstract methods, only one abstract method is possible in a functional interface Île{}
}

@FunctionalInterface // This annotation is optional but recommended for clarity
interface B
{
    public void show(int a ); // another abstract method
}
@FunctionalInterface
interface C
{
    public void add(int a, int b); // another abstract method
}
@FunctionalInterface
interface D // Functional interface with return type
{
    int add(int a, int b); 
}

interface E 
{
    int add(int a, int b); 
}



public class LambdaExpression 
{
    public static void main(String[] args) 
    {
        A obj = () -> System.out.println("Hello, this is a lambda expression!"); // Lambda expression implementing the abstract method
        obj.show(); // Calling the method implemented by the lambda expression



        B obj1 = a -> System.out.println("show value of a :" + a); // When its single variable, we can use it without parentheses
        obj1.show(5); 
        C obj2 = (a, b) -> System.out.println("Sum of a and b is: " + (a + b)); // Lambda expression with two parameters
        obj2.add(10, 20); 



        D obj3 = (a,  b) -> 
            {
                return a+b;
            }; 
        System.out.println("Sum of a and b is: " + obj3.add(10, 20)); // Calling the method implemented by the lambda expression
        
        E obj4 = (a, b) -> a + b; // Lambda expression with return type in single line and no need for return keyword
        System.out.println("Sum of a and b is: " + obj4.add(10, 30)); 


    }
}
