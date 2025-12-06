// 4. Abstraction 🌫️
// Abstraction is the concept of showing only essential information to the user and hiding the internal implementation details.

// It focuses on "what" an object does rather than "how" it does it.

// It is achieved in Java using Abstract Classes and Interfaces.
// Interface (100% Abstraction)
package com2OOPS.sub4Abstraction;
interface PaymentProcessor {
    // Defines WHAT must be done (an abstract method)
    void processPayment(double amount);
}

// Concrete Class (provides the HOW)
class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        // Hiding the details:
        // Internal logic: connect to payment gateway, validate card, send request...
        System.out.println("Processing credit card payment of " + amount);
    }
}



interface A
{
//	public abstract void show();
//	public abstract void config();
	int age=44;            // final and static 
	String area="Mumbai";
	
	void show();
	void config();
}

class B implements A
{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in cofing");
	}
}

public class Abstraction {
    public static void main(String[] args) {

    	A obj;
    	obj=new B();
    	
    	obj.show();
    	obj.config();
    	
 //   	A.area="Hyderabad";
    	
    	System.out.println(A.area);
        
    }
}
