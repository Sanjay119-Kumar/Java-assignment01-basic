package assignment15;

/*  QUESTION - 04 - Define a class Customer with instance variables id, name, mobile.
                    Provide three constructors to initialize member variables of customer.
                    First constructor with four arguments,
                    Second constructor with three arguments, leaving out email.
 */

public class Customer {
    private int id; // Private instance variable for customer ID
    private String name; // Private instance variable for customer name
    private long mobile; // Private instance variable for customer mobile number
    private String email; // Private instance variable for customer email address

    // Getter method for id
    public int getId() {
        return id; // Returns the value of id
    }

    // Setter method for id
    public void setId(int id) {
        this.id = id; // Sets the value of id
    }

    // Getter method for name
    public String getName() {
        return name; // Returns the value of name
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name; // Sets the value of name
    }

    // Getter method for mobile
    public long getMobile() {
        return mobile; // Returns the value of mobile
    }

    // Setter method for mobile
    public void setMobile(long mobile) {
        this.mobile = mobile; // Sets the value of mobile
    }

    // Getter method for email
    public String getEmail() {
        return email; // Returns the value of email
    }

    // Setter method for email
    public void setEmail(String email) {
        this.email = email; // Sets the value of email
    }

    // First constructor with four arguments to initialize all member variables
    public Customer(int i, String n, long m, String e) {
        this.id = i; // Initialize id with the provided argument
        this.name = n; // Initialize name with the provided argument
        this.mobile = m; // Initialize mobile with the provided argument
        this.email = e; // Initialize email with the provided argument
    }

    // Second constructor with three arguments, leaving out email
    public Customer(int i1, String n1, long m1) {
        this.id = i1; // Initialize id with the provided argument
        this.name = n1; // Initialize name with the provided argument
        this.mobile = m1; // Initialize mobile with the provided argument
        this.email = null; // Initialize email to null (or a default value)
    }

    // Method to show customer information initialized with four arguments
    public void showCustomerInformationWithFourArguments() {
        System.out.println("*************** Customer Information ***********************" + "\n" +
                "Customer id = " + id + "\n" + // Display the customer's id
                "Customer name = " + name + "\n" + // Display the customer's name
                "Customer mobile = " + mobile + "\n" + // Display the customer's mobile number
                "Customer email = " + email + "\n" // Display the customer's email address
        );
    }

    // Method to show customer information initialized with three arguments
    public void showCustomerInformationWithThreeArguments() {
        System.out.println("*************** Customer Information ***********************" + "\n" +
                "Customer id = " + id + "\n" + // Display the customer's id
                "Customer name = " + name + "\n" + // Display the customer's name
                "Customer mobile = " + mobile + "\n" + // Display the customer's mobile number
                "Customer email = " + email + "\n" // Display the customer's email address (which might be null)
        );
    }
}
