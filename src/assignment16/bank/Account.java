package assignment16.bank;

/*
    QUESTION.2.-> Define a java class Account with properties account number and balance as private members.
                  Also define protected methods to access balance. Write a class Customer with account and customer
                  name as private instance members. Define public methods to deposit, withdraw and check balance.
                  Both the classes should reside in different packages. If you are facing problems implementing this
                  problem, propose an idea to resolve the issue and also implement your idea.
*/
public class Account {
    private long accountNumber; // Private member to store account number
    private double balance; // Private member to store account balance

    // Constructor for instance initialization
    public Account(long a, double b) {
        this.accountNumber = a; // Initialize account number
        this.balance = b; // Initialize balance
    }

    // Protected method to set the balance
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Protected method to get the balance
    protected double getBalance() {
        return balance;
    }

    // Public method to get the account number
    public long getAccountNumber() {
        return accountNumber;
    }

    // Public method to set the account number
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Public method to deposit money into the account
    public boolean depositMoney(double amount) {
        if (amount > 0) { // Ensure the deposit amount is positive
            balance += amount; // Increase the balance
            System.out.println("Money deposited successfully: " + balance);
            return true;
        }
        return false; // Return false if the deposit amount is not positive
    }

    // Public method to withdraw money from the account
    public boolean withdrawMoney(double amount) {
        if (amount > 0 && balance >= amount) { // Ensure the withdraw amount is positive and sufficient balance is available
            balance -= amount; // Decrease the balance
            System.out.println("Withdraw amount successfully: " + amount);
            return true;
        } else {
            System.out.println("Low balance !!"); // Print message if insufficient balance
            return false; // Return false if withdrawal conditions are not met
        }
    }
}
