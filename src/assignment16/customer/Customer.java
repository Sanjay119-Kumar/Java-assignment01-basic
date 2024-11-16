package assignment16.customer;

import assignment16.bank.Account;

public class Customer extends Account {
    private String customerName; // Private member to store customer name

    // Constructor for instance initialization
    public Customer(String customerName, double initialBalance, long accountNumber) {
        super(accountNumber, initialBalance); // Call to the superclass constructor
        this.customerName = customerName; // Initialize customer name
    }

    // Method to deposit money, inherits from Account class
    @Override
    public boolean depositMoney(double amount) {
        return super.depositMoney(amount); // Call the superclass method
    }

    // Method to withdraw money, inherits from Account class
    @Override
    public boolean withdrawMoney(double amount) {
        return super.withdrawMoney(amount); // Call the superclass method
    }

    // Method to check the balance
    public void checkBalance() {
        double balance = super.getBalance(); // Get balance using superclass method
        System.out.println("Balance = " + balance); // Print the balance
    }

    // Method to show account information
    public void showAccountInfo() {
        System.out.println("*********** Account Information **************" + "\n" +
                "Account Holder Name: " + customerName + "\n" + // Print customer name
                "Balance = " + getBalance() + "\n" + // Print current balance
                "Account number: " + getAccountNumber() // Print account number
        );
    }
}
class TestCustomerAccount {
    public static void main(String[] args) {
        // Create a Customer object with initial details
        Customer c1 = new Customer("Sanjay Kumar", 1500.00, 62993872);
        c1.depositMoney(100.00); // Deposit money into c1's account
        c1.withdrawMoney(500.00); // Withdraw money from c1's account
        c1.checkBalance(); // Check and print the balance for c1
        c1.showAccountInfo(); // Show account information for c1

        System.out.println("------------------------------------------");

        // Create another Customer object with initial details
        Customer c2 = new Customer("Ranjay Kumar", 2500, 12345678);
        c2.depositMoney(500.00); // Deposit money into c2's account
        c2.withdrawMoney(700.00); // Withdraw money from c2's account
        c2.checkBalance(); // Check and print the balance for c2
        c2.showAccountInfo(); // Show account information for c2
    }
}
