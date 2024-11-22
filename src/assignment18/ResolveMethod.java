package assignment18;

/*
    QUESTION-4: Demonstrate how to invoke the superclass version of a method from an overridden method in a subclass.
*/

// Superclass
public class ResolveMethod {
    private int id;         // Superclass instance variable
    private String name;    // Superclass instance variable

    // Constructor for superclass
    public ResolveMethod(int id, String name) {
        this.id = id;       // Assigns parameter to superclass instance variable
        this.name = name;   // Assigns parameter to superclass instance variable
    }

    // Method to print details of the superclass
    public void printDetail() {
        System.out.println("Super-Class id: " + id);
        System.out.println("Super-Class name: " + name);
    }
}

// Subclass
class SubClass extends ResolveMethod {
    private long phone;    // Subclass instance variable

    // Constructor for subclass
    public SubClass(int id, String name, long phone) {
        super(id, name);   // Calls the superclass constructor
        this.phone = phone; // Assigns parameter to subclass instance variable
    }

    // Overridden method to print details of the subclass
    @Override
    public void printDetail() {
        super.printDetail();   // Calls the superclass version of the method
        System.out.println("Sub-Class phone: " + phone);
    }
}

// Test class to demonstrate functionality
class CheckMethod {
    public static void main(String[] args) {
        // Create an instance of SubClass
        SubClass sb = new SubClass(1, "Demo", 1234567890);

        // Call the overridden method
        sb.printDetail();
    }
}
