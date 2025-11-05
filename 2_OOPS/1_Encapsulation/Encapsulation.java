// 1. Encapsulation 🛡️
// Encapsulation is the mechanism of wrapping data (variables) and code acting on the data (methods) together as a single unit. It involves:

// Data Hiding: Declaring variables as private so they can't be accessed directly from outside the class.
// Controlled Access:
//                   Providing public "getter" (to read) 
//                                and "setter" (to modify) methods to allow controlled access to the private data.

class BankAccount {
    // 1. Data/variables are private (Data Hiding)
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // 2. Public 'getter' method to read the balance
    public double getBalance() {
        return balance;
    }

    // 3. Public 'setter' method to modify the balance with control/validation
    public void deposit(double amount) {
        if (amount > 0) { // Enforcing a rule/control
            balance += amount;
        }
    }
}



class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        
        // Accessing balance via getter
        System.out.println("Initial Balance: " + account.getBalance());
        
        // Depositing money via setter
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());
    }
}