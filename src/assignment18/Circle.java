package assignment18;

/*
    QUESTION-2: Define a Circle class with the following:
                - `radius` as an instance variable
                - `PI` as a static-final variable initialized using a static block
                - Default radius value set to 5 using an initialization block
                - Methods: setRadius(), getRadius(), getArea()
*/

public class Circle {
    // Instance variable to hold the radius of the circle
    private double radius;

    // Static-final variable to hold the value of PI
    private static final double PI;

    // Static block to initialize the static variable PI
    static {
        PI = 3.145; // Setting the value of PI
    }

    // Initialization block to set a default value for radius
    {
        radius = 5; // Default radius
    }

    // Setter method to set the radius of the circle
    public void setRadius(double radius) {
        this.radius = radius; // Assign the provided radius to the instance variable
    }

    // Getter method to get the radius of the circle
    public double getRadius() {
        return radius; // Return the current value of radius
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return PI * radius * radius; // Formula for area of a circle
    }
}

// Test class to verify the Circle class
class CheckCircle {
    public static void main(String[] args) {
        // Create a Circle object with default radius
        Circle c1 = new Circle();

        // Display the area of the circle
        System.out.println("Area = " + c1.getArea()); // Output: Area = 78.625
    }
}
