package lectureExamples;

// Demonstrates the use of final and static keywords for variables
public class StaticKeywordDemo {

    // A final static variable must be initialized only once and is shared across all instances
    final static private int k; // Declare a final static variable

    // Static block to initialize the final static variable
    static {
        k = 100; // Assign value to the final static variable during class loading
    }

    // Static method to print the value of the static variable
    public static void printK() {
        System.out.println("K = " + k); // Output the value of k
    }
}

// Class to test the StaticKeywordDemo class
class CheckStaticFinalK {
    public static void main(String[] args) {
        // Call the static method directly using the class name
        StaticKeywordDemo.printK(); // Output: K = 100
    }
}
