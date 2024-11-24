package assignment19;

/*
    QUESTION-1: Define a Java class Account with balance, accountNo as instance variables
                and rateOfInterest as a static variable. Define setters and getters.
                Provide an abstract method calculateInterest(int time).
*/

abstract public class Account {
    private double balance; // Instance variable for balance
    private long accountNumber; // Instance variable for account number
    private static double rateOfInterest; // Static variable for rate of interest

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative !!");
        }
        this.balance = balance;
    }

    // Getter and Setter for account number
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        if (String.valueOf(accountNumber).length() != 10) {
            throw new IllegalArgumentException("Account number must be 10 digits.");
        }
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for rate of interest
    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        if (rateOfInterest < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }
        Account.rateOfInterest = rateOfInterest;
    }

    // Abstract method to calculate interest
    public abstract double calculateInterest(int time);
}

// Subclass to calculate interest
class RateOfInterest extends Account {
    @Override
    public double calculateInterest(int time) {
        return getBalance() * getRateOfInterest() * time / 100;
    }

    public void showAccountInfo() {
        System.out.println("🌟🌟🌟🌟Account Information🌟🌟🌟🌟");
        System.out.println("Balance : " + getBalance());
        System.out.println("Account No. : " + getAccountNumber());
        System.out.println("Rate of Interest : " + getRateOfInterest());
    }
}

// Main class to test functionality
class CheckInterest {
    public static void main(String[] args) {
        RateOfInterest rate = new RateOfInterest();

        // Setting values
        rate.setBalance(5000.00);
        rate.setAccountNumber(1234567890);
        Account.setRateOfInterest(8.0);

        // Displaying account info
        rate.showAccountInfo();

        // Calculating and displaying interest
        System.out.println("Total Interest : " + rate.calculateInterest(5));
    }
}

/*
    QUESTION-2: Define a subclass SavingAccount of Account with customerName as
                an instance variable. Provide appropriate methods.
*/

class SavingAccount extends Account {
    private String customerName; // Instance variable for customer name

    // Getter and Setter for customer name
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public double calculateInterest(int time) {
        // Standard interest calculation using the formula: (Principal * Rate * Time) / 100
        return getBalance() * getRateOfInterest() * time / 100;
    }
}


/*
    QUESTION-3: In question-2 write a driver program to create object of SavingAccount and demonstrate call to all
                possible methods

*/

class Driver {
    public static void main(String[] args) {
        // Create an object of SavingAccount
        SavingAccount sa = new SavingAccount();

        // Set values for balance, account number, customer name, and interest rate
        sa.setBalance(120000.00);
        sa.setAccountNumber(1234567890);
        sa.setCustomerName("Babu");
        Account.setRateOfInterest(5.0);

        // Display information
        System.out.println("Customer Name : " + sa.getCustomerName());
        System.out.println("Account Number : " + sa.getAccountNumber());
        System.out.println("Balance : " + sa.getBalance());
        System.out.println("Rate of Interest : " + Account.getRateOfInterest());
        System.out.println("Interest for 2 years : " + sa.calculateInterest(2));
    }
}


/*
    QUESTION-4: Answer the following interview questions

                - Can abstract modifier applicable for variables?
                - Can abstract method be declared as static?
                - What is concrete method in java?
                - Can abstract class hava constructor?
                - Can we define an abstract method inside non-abstract class

Answers


Q.1.Can the abstract modifier be applied to variables?
ANS->No, variables cannot be abstract. Only methods and classes can be abstract.

Q.2.Can an abstract method be declared as static?
ANS->No, abstract methods cannot be static because they are meant to be overridden, and static methods cannot be overridden.

Q.3.What is a concrete method in Java?
ANS->A concrete method is a method with a complete implementation (non-abstract).

Q.4.Can an abstract class have a constructor?
ANS->Yes, an abstract class can have a constructor, which is invoked when its subclass is instantiated.

Q.5.Can we define an abstract method inside a non-abstract class?
ANS->No, an abstract method must be inside an abstract class.

*/

/*

     QUESTION-5: State true or False

                 - A class without abstract method can not be an abstract class.
                 - A class containing abstract method must be an abstract class
                 - An abstract method is always a final method.

Q.1. A class without an abstract method cannot be an abstract class.
ANS->False: A class can be abstract even without an abstract method.

Q.2. A class containing abstract method must be an abstract class.
True: A class with at least one abstract method must be declared as abstract.

Q.3.An abstract method is always a final method.
False: Abstract methods cannot be final because they are meant to be overridden.


*/