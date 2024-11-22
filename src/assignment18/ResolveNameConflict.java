package assignment18;

/*
    QUESTION-4: Demonstrate how to resolve name conflict among local variables,
                instance variables of a subclass, and instance variables of a superclass.
*/

public class ResolveNameConflict {
    private int personID; // Superclass instance variable
    private String personName; // Superclass instance variable

    // Constructor for superclass
    public ResolveNameConflict(int personID, String personName) {
        this.personID = personID; // Refers to the superclass instance variable
        this.personName = personName; // Refers to the superclass instance variable
    }

    // Getters for superclass variables
    public int getPersonID() {
        return personID;
    }

    public String getPersonName() {
        return personName;
    }
}

class Employees extends ResolveNameConflict {
    private int empSalary; // Subclass instance variable

    // Constructor for subclass
    public Employees(int personID, String personName, int empSalary) {
        super(personID, personName); // Calls the superclass constructor
        this.empSalary = empSalary; // Refers to the subclass instance variable
    }

    // Method to demonstrate resolving name conflicts
    public void showData() { // Local variable
        System.out.println("Local variable (empSalary): " + empSalary); // Local variable
        System.out.println("Subclass instance variable (empSalary): " + this.empSalary); // Subclass variable
        System.out.println("Superclass instance variable (personID): " + super.getPersonID()); // Superclass variable
        System.out.println("Superclass instance variable (personName): " + super.getPersonName()); // Superclass variable
    }
}

class TestResolveNameConflict {
    public static void main(String[] args) {
        // Create an Employees object with data
        Employees emp = new Employees(101, "Alice", 50000);

        // Show data to resolve name conflicts
        emp.showData(); // Pass a local variable value
    }
}
