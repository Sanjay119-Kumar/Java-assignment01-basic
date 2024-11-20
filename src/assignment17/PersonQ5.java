package assignment17;

/*
    QUESTION - 5 - Define a class Person with name as an instance variable. Provide setters and
                   getters. Provide an overloaded version of the showName() method:
                   - One without arguments to display the name of the person.
                   - Second with one argument ("Mr" or "Ms") to display the name with a title.
*/
public class PersonQ5 {
    // Instance variable to store the name of the person
    private String name;

    // Getter method for the 'name' variable
    public String getName() {
        return name;
    }

    // Setter method to set the value of the 'name' variable
    public void setName(String name) {
        this.name = name;
    }

    // Method to display the name without a title
    public void showName() {
        System.out.println("Name: " + name);
    }

    // Overloaded method to display the name with a title
    public void showName(String title) {
        // Concatenates the title and name for display
        System.out.println("Name: " + title + name);
    }
}

// Testing class to check the functionality of the PersonQ5 class
class CheckName {
    public static void main(String[] args) {
        // Create an instance of the PersonQ5 class
        PersonQ5 p1 = new PersonQ5();

        // Set the name of the person
        p1.setName("Demo");

        // Display the name without a title
        p1.showName(); // Expected output: "Name: Demo"

        // Display the name with a title
        p1.showName("Mr "); // Expected output: "Name: Mr Demo"
    }
}
