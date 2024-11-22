
                     /* Assignment - 18 - final , this , super , constructor in inheritance*/

package assignment18;

/*
    QUESTION-1: Define a Java class Person with name and age as instance variables. 
                Provide a parameterized constructor with two arguments (name & age) to initialize instance variables.
                Ensure that age cannot be negative.
*/

// Class representing a Person
public class Person {
    // Instance variables
    private String name; // Person's name
    private int age;     // Person's age

    // Parameterized constructor to initialize name and age
    public Person(String n, int a) {
        // Validate that age is not negative
        if (a < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.name = n;  // Initialize name
        this.age = a;   // Initialize age
    }

    // Override toString() to display person information
    public String toString() {
        return name + " " + age; // Format: "Name Age"
    }
}

// Test class to verify Person implementation
class Test {
    public static void main(String[] args) {
        // Create a Person object
        Person p = new Person("Sanjay Kumar", 20);

        // Print the Person object
        System.out.println(p); // Output: Sanjay Kumar 20
    }
}
