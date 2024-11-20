package lectureExamples;

// Lecture Override Example
// The Person class represents a basic person with a name and age.
public class Person {
    private String name; // Instance variable to hold the person's name
    private int age; // Instance variable to hold the person's age

    // Getter method to get the name of the person
    public String getName() {
        return name;
    }

    // Setter method to set the name of the person
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to get the age of the person
    public int getAge() {
        return age;
    }

    // Setter method to set the age of the person
    public void setAge(int age) {
        this.age = age;
    }

    // Constructor to initialize the Person object with name and age
    public Person(String n , int a){
        this.name = n; // Setting the name
        this.age = a; // Setting the age
    }

    // Method to display the details of the person
    public void showDetail(){
        System.out.println("Name : " + name );
        System.out.println("Age : " + age);
    }
}

// The Employee class inherits from the Person class
class Employee extends Person{
    private double salary; // Instance variable to hold the employee's salary

    // Constructor to initialize the Employee object with name, age, and salary
    public Employee(String n, int a, double s){
        super(n, a); // Calling the superclass (Person) constructor
        this.salary = s; // Setting the salary
    }

    // Overriding the showDetail method to display employee-specific details
    @Override
    public void showDetail() {
        System.out.println("Employee Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Salary : " + salary);
    }
}

// Class to test the Person and Employee classes
class OverrideCheck{
    public static void main(String[] args) {
        Employee e1 = new Employee("Demo", 20, 205000); // Creating an Employee object
        e1.showDetail(); // Displaying the details of the employee
    }
}
