package assignment15;

/*  QUESTION - 03 - Define a class Box with private instance variables length, breadth, and height.
                    Provide three constructors in the class:
                    First with no arguments,
                    Second with one argument,
                    Third with three arguments
 */

public class Box {
    // Private instance variables for length, breadth, and height
    private float length, breadth, height;

    // Getter method for length
    public float getLength() {
        return length; // Returns the length of the box
    }

    // Setter method for length
    public void setLength(float length) {
        this.length = length; // Sets the length of the box
    }

    // Getter method for breadth
    public float getBreadth() {
        return breadth; // Returns the breadth of the box
    }

    // Setter method for breadth
    public void setBreadth(float breadth) {
        this.breadth = breadth; // Sets the breadth of the box
    }

    // Getter method for height
    public float getHeight() {
        return height; // Returns the height of the box
    }

    // Setter method for height
    public void setHeight(float height) {
        this.height = height; // Sets the height of the box
    }

    // No-argument constructor
    public Box() {
        System.out.println("No - Argument Constructor"); // Indicates that the no-argument constructor is called
    }

    // Single-argument constructor to initialize length
    public Box(float length) {
        this.length = length; // Sets the length of the box
        System.out.println("Single Argument Constructor"); // Indicates that the single-argument constructor is called
    }

    // Three-argument constructor to initialize length, breadth, and height
    public Box(float length1, float breadth1, float height1) {
        this.length = length1; // Sets the length of the box
        this.breadth = breadth1; // Sets the breadth of the box
        this.height = height1; // Sets the height of the box
        System.out.println("Three Argument Constructor"); // Indicates that the three-argument constructor is called
    }

    // Method to display the box dimensions
    public void showBox() {
        System.out.println("length= " + length + " breadth= " + breadth + " height= " + height); // Prints the dimensions of the box
    }
}
