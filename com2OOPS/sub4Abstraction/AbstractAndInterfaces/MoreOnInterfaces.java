// class - class -> extends
// interface - class -> implements
// interface - interface -> extends
// class - interface -> not possible (Syntax Error)
// interface - class -> not possible (Syntax Error)
package com2OOPS.sub4Abstraction.AbstractAndInterfaces;
interface A 
{
    int age = 10; // public static final by default
    String area = "usa"; // public static final by default
    void config(); // public abstract by default
    void show(); // public abstract by default

}
interface X
{
    void run(); // public abstract by default
}
interface Y extends X
{
    void display(); // public abstract by default
}

class B implements A, Y
{
    public void config() 
    {
        System.out.println("Config method from interface A");
    }
    
    public void show() 
    {
        System.out.println("Show method from interface A");
    }
    
    public void run() 
    {
        System.out.println("Run method from interface X");
    }
    
    public void display() 
    {
        System.out.println("Display method from interface y");
    }
}
public class MoreOnInterfaces 
{
    public static void main(String[] args) 
    {
        A obj = new B(); // Creating an instance of class B that implements interface A
        obj.config(); // Calling the config method from interface A
        obj.show(); // Calling the show method from interface A
        System.out.println("Interface variable age: " + A.age); // Accessing the interface
        System.out.println("Interface variable area: " + A.area); // Accessing the interface variable

        Y obj1  = new B();
        obj1.run(); // Calling the run method from interface X
        obj1.display(); // Calling the display method from interface Y

    }
}
