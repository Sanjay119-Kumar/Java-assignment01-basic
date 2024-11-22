package lectureExamples;

import java.util.Scanner;

public class FinalLocalVariable {
    // Final instance variable: must be initialized once either at declaration, in the constructor, or in an initialization block.
    final private int x;

    // Final static variable: must be initialized once, typically at declaration or in a static block.
    final static private int p;

    // Constructor to initialize the final instance variable using user input.
    public FinalLocalVariable(int m) {
        x = m; // Assign the passed value to the final instance variable.
    }

    // Method to print the value of the instance variable `x`.
    public void printX() {
        System.out.println("X=" + x);
    }

    // Static block to initialize the static final variable `p`.
    // Here, input is taken from the user using a Scanner object.
    static {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt(); // Assigns user input to the static final variable `p`.
    }

    // Method to print the value of the static final variable `p`.
    public void printP() {
        System.out.println("P=" + p);
    }

    // Demonstrating the use of final local variables.
    public void printValue() {
        int x = 1; // Local variable.
        final int y = 10; // Final local variable: its value cannot be changed.
        System.out.println("x=" + x + " Y=" + y);

        x++; // Modifying the non-final local variable.
        // y++; // This would cause an error because `y` is declared as final.

        System.out.println("x=" + x + " y=" + y);
    }
}

class TestFinalLocalVariables {
    public static void main(String[] args) {
        // Creating an instance of the FinalLocalVariable class and passing a value for the final instance variable.
        FinalLocalVariable f1 = new FinalLocalVariable(27);

        // Calling methods to demonstrate final instance, static, and local variables.
        f1.printP(); // Print the value of the static final variable.
        f1.printX(); // Print the value of the instance final variable.
        f1.printValue(); // Demonstrate the use of final local variables.
    }
}
