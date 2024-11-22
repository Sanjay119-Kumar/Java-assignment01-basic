package assignment18;

/*
    QUESTION-3: Define a super-class Person with name and age as instance variables.
                Provide two constructors, one without arguments and another with two
                arguments. No argument constructor should call parameterised constructor
                with dummy arguments. Define a sub-class Employee with salary as instance variable.
                Provide two constructors, one with no argument and another one with one argument
                for salary. No argument constructor should call parameterised constructor of the
                same class by passing dummy data. Also define methods to show Employee data.
*/

// Superclass Person
public class PersonQ3 {
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // No-argument constructor
    public PersonQ3() {
        // Calling parameterized constructor with dummy data
        this("No name", 20);
    }

    // Parameterized constructor
    public PersonQ3(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Subclass Employee
class Employee extends PersonQ3 {
    private double salary;

    // No-argument constructor
    public Employee() {
        // Calling the parameterized constructor with dummy data
        this(0.0);
    }

    // Parameterized constructor
    public Employee(double salary) {
        // Calling the parent class's parameterized constructor
        super("Sanjay", 21);
        this.salary = salary;
    }

    // Method to show employee data
    public void showEmployeeData() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + salary);
    }
}

// Test class to demonstrate functionality
class CheckEmployee {
    public static void main(String[] args) {
        // Creating an instance of Employee using the no-argument constructor
        Employee e1 = new Employee();
        e1.showEmployeeData();
        System.out.println("-------------------------------");

        // Creating another instance of Employee using the parameterized constructor
        Employee e2 = new Employee(2000.00);
        e2.showEmployeeData();
    }
}
