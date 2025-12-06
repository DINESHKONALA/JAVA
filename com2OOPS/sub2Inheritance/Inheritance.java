// 2. Inheritance 🧬
// Inheritance is a mechanism where one class acquires the properties (fields) and behaviors (methods) of another class. 

// The class that inherits is called the subclass (or child class), 
// and the class whose properties are inherited is called the superclass (or parent class).

// It promotes reusability of code.
// The extends keyword is used to implement inheritance in Java.



// 1. The Superclass (BankAccount)
// Parent Class (Superclass) - Defines common properties and behaviors
package com2OOPS.sub2Inheritance;
class BankAccount2 
{
    protected double balance; // Accessible in subclasses
    protected String accountNumber;

    public BankAccount2(String accNo, double initialBalance) 
    {
        this.accountNumber = accNo;
        this.balance = initialBalance;
        System.out.println("Account created: " + accountNumber);
    }

    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        }
    }
    
    public double getBalance() 
    {
        return balance;
    }
}


// 2. The Subclass (SavingsAccount)
// Child Class (Subclass) - Inherits from BankAccount using 'extends'
class SavingsAccount extends BankAccount2 {
    private double interestRate; // Specific property for Savings

    public SavingsAccount(String accNo, double initialBalance, double rate) 
    {
        // Must call the superclass constructor first
        super(accNo, initialBalance); 
        this.interestRate = rate;
    }

    // Specific behavior for SavingsAccount
    public void addInterest() 
    {
        double interest = balance * interestRate;
        balance += interest; // Directly accessing 'balance' because it is 'protected'
        System.out.println("Interest added at " + (interestRate * 100) + "%. Interest: $" + interest);
        System.out.println("Balance after interest: $" + balance);
    }

    // Method Overriding (an aspect of Polymorphism, often used with Inheritance)
    public void withdraw(double amount) 
    {
        if (balance - amount < 100) 
        { // Specific rule: Maintain a minimum balance of $100
            System.out.println("Withdrawal failed: Minimum balance of $100 must be maintained.");
        } 
        else if (amount > 0) 
        {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
        }
    }
}

// 3. Demonstration (Main Class)
public class Inheritance 
{
    public static void main(String[] args) 
    {
        // Create an instance of the specialized SavingsAccount
        SavingsAccount myAccount = new SavingsAccount("S12345", 500.00, 0.05);

        // 1. Use an INHERITED method from BankAccount
        myAccount.deposit(100.00); 

        // 2. Use the specialized method from SavingsAccount
        myAccount.addInterest(); 
        
        // 3. Use the OVERRIDDEN method from SavingsAccount (with min balance check)
        myAccount.withdraw(550.00); // Fails due to min balance rule
        
        // 4. Successful withdrawal
        myAccount.withdraw(200.00); 
    }
}
