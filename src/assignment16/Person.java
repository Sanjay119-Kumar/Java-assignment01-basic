
                             /* Assignment - 16 - Inheritance */


package assignment16; // Declares the package name

import java.util.Scanner; // Imports the Scanner class for user input

/*
 QUESTION.1.-> Define a java class Person with private instance variables name and age.
               Also define setter and getters (as protected members ). Define Employee
               class by extending Person with property salary. Also define public methods
               input and display Employee's name age and salary.
 */
public class Person {
    // Private instance variables for name and age
    private String personName;
    private int personAge;

    // Protected method to set the person's name
    protected void setPersonName(String name) {
        this.personName = name;
    }

    // Protected method to set the person's age
    protected void setPersonAge(int age) {
        this.personAge = age;
    }

    // Protected method to get the person's name
    protected String getPersonName() {
        return personName;
    }

    // Protected method to get the person's age
    protected int getPersonAge() {
        return personAge;
    }
}

// Employee class extending Person
class Employee extends Person {
    // Private instance variable for salary
    private double employeeSalary;

    // Public method to input employee details
    public void inputEmployeeDetails() {
        System.out.println("*********Enter the employee details:************"); // Prompt message
        Scanner sc = new Scanner(System.in); // Creates a Scanner object for user input

        System.out.print("Enter name: "); // Prompt for name
        String name = sc.nextLine(); // Reads the name from the user
        setPersonName(name); // Sets the name in the parent class (Person)

        System.out.print("Enter age: "); // Prompt for age
        int age = sc.nextInt(); // Reads the age from the user
        setPersonAge(age); // Sets the age in the parent class (Person)

        System.out.print("Enter salary: "); // Prompt for salary
        employeeSalary = sc.nextDouble(); // Reads the salary from the user
    }

    // Public method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("******Employee Details*********"); // Header for employee details
        System.out.println("Employee Name = " + getPersonName()); // Displays the name
        System.out.println("Employee Age = " + getPersonAge()); // Displays the age
        System.out.println("Employee Salary = " + employeeSalary); // Displays the salary
    }
}

// Test class to run the application
class Test {
    public static void main(String[] args) {
        Employee employee = new Employee(); // Creates an Employee object
        employee.inputEmployeeDetails(); // Calls method to input details
        employee.displayEmployeeDetails(); // Calls method to display details
    }
}
