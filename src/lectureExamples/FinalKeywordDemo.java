package lectureExamples;

// Demonstrates the use of the final keyword for variables
public class FinalKeywordDemo {

    // A final variable must be initialized and cannot be changed later
    final private int x;

    // Constructor to initialize the final variable
    public FinalKeywordDemo() {
        x = 100; // Assign value to x during object creation
    }

    // OR: Initialization block to assign a value to the final variable (can use either constructor or this block)
    /*
    {
        x = 200; // Uncomment this block if not using the constructor
    }
    */

    // Method to print the value of the final variable
    public void printX() {
        System.out.println("x = " + x); // Output the value of x
    }
}

// Class to test the FinalKeywordDemo class
class CheckFinalVariable {
    public static void main(String[] args) {
        FinalKeywordDemo f1 = new FinalKeywordDemo(); // Create an object of FinalKeywordDemo
        f1.printX(); // Call the method to display the value of x
    }
}
